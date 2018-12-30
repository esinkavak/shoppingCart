package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Coupon;
import com.example.demo.model.Product;

public interface ShoppingCartService {

	public void addItem(Product p, int quantity);

	public void applyDiscounts(Category category);

	public void applyCoupon(Coupon coupon);

	double getTotalAmountAfterDiscounts();

	double getCouponDiscount(Coupon coupon);

	double getCampaignDiscount();

	double getDeliveryCost();

}
