package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.common.DiscountType;
import com.example.demo.model.Campaign;
import com.example.demo.model.Category;
import com.example.demo.model.Coupon;
import com.example.demo.model.Product;
import com.example.demo.service.CampaignService;
import com.example.demo.service.DeliveryCostCalculatorService;
import com.example.demo.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	// TODO: may be from repository
	public static final String DISCOUNT_CATEGORY = "food";

	private List<Category> categories;
	private List<Product> products;
	private int itemCount = 0;
	private double totalPrice;
	private double campaignDiscount = 0;

	@Autowired
	CampaignService campaignService;

	@Autowired
	DeliveryCostCalculatorService deliveryService;

	public ShoppingCartServiceImpl() {
		categories = new ArrayList<Category>();
		products = new ArrayList<Product>();
	}

	@Override
	public void addItem(Product p, int quantity) {
		products.add(p);
		itemCount += quantity;
		totalPrice += p.getPrice() * quantity;
	}

	@Override
	public void applyDiscounts(Category category) {

		// List<Campaign> campaigns = campaignService.getCampaigns(category);

		List<Campaign> campaigns = new ArrayList<>();

		Campaign campaign1 = new Campaign(category, 20.0, 3, DiscountType.RATE);
		Campaign campaign2 = new Campaign(category, 50.0, 5, DiscountType.RATE);
		Campaign campaign3 = new Campaign(category, 5.0, 5, DiscountType.AMOUNT);

		campaigns.add(campaign1);
		campaigns.add(campaign2);
		campaigns.add(campaign3);

		double discounts[] = new double[campaigns.size()];
		for (int i = 0; i < campaigns.size(); i++)
			discounts[i] = 0;

		for (int i = 0; i < campaigns.size(); i++) {
			discounts[i] = getDiscountByCampaign(campaigns.get(i));
			System.out.println("discounts[" + i + "]:" + discounts[i]);
		}
		totalPrice = totalPrice - getMaxDiscount(discounts);

		System.out.println("itemCount:" + itemCount);
		System.out.println("totalPrice:" + totalPrice);
	}

	public double getMaxDiscount(double[] discounts) {
		campaignDiscount = discounts[0];
		for (int i = 1; i < discounts.length; i++) {
			if (discounts[i] > campaignDiscount) {
				campaignDiscount = discounts[i];
			}
		}
		return campaignDiscount;
	}

	public double getDiscountByCampaign(Campaign campaign) {

		double discount = 0;

		if (campaign.getCategory().getTitle().equalsIgnoreCase(DISCOUNT_CATEGORY)) {
			if (itemCount > campaign.getItemCount()) {
				if (campaign.getDiscountType().equals(DiscountType.RATE))
					discount = totalPrice * campaign.getRatio() / 100;
				else if (campaign.getDiscountType().equals(DiscountType.AMOUNT))
					discount = campaign.getRatio();
			}
		}

		return discount;
	}

	@Override
	public void applyCoupon(Coupon coupon) {
		if (totalPrice > coupon.getMinPurchase()) {
			if (coupon.getDiscountType().equals(DiscountType.RATE)) {
				double discount = getCouponDiscount(coupon);
				totalPrice -= discount;
				System.out.println("totalPrice after coupon:" + totalPrice);
			}
		}
	}

	@Override
	public double getCampaignDiscount() {
		System.out.println("getCampaignDiscount:" + campaignDiscount);
		return campaignDiscount;
	}

	@Override
	public double getTotalAmountAfterDiscounts() {
		System.out.println("getTotalAmountAfterDiscounts:" + totalPrice);
		return totalPrice;
	}

	@Override
	public double getCouponDiscount(Coupon coupon) {
		double discount = totalPrice * coupon.getRatio() / 100;
		System.out.println("getCouponDiscount:" + discount);
		return discount;
	}

	@Override
	public double getDeliveryCost() {
		return deliveryService.calculatefor(this);
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

}
