package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.DiscountType;
import com.example.demo.model.Category;
import com.example.demo.model.Coupon;
import com.example.demo.model.Product;
import com.example.demo.service.CampaignService;
import com.example.demo.service.ShoppingCartService;
import com.example.demo.service.impl.ShoppingCartServiceImpl;

@RestController
public class DemoRestController {

	@Autowired
	ShoppingCartService shoppingCartService;

	@Autowired
	CampaignService campaignService;

	@RequestMapping("/shoppingCart")
	public void print() {
		ShoppingCartServiceImpl cart = new ShoppingCartServiceImpl();

		List<Category> categories = new ArrayList<Category>();
		Category category = new Category("food");
		categories.add(category);
		cart.setCategories(categories);

		Product apple = new Product("Apple", 100.0, category);
		Product almond = new Product("Almonds", 150.0, category);

		cart.addItem(apple, 3);
		cart.addItem(almond, 1);

		cart.applyDiscounts(category);

		Coupon coupon = new Coupon(100, 10, DiscountType.RATE);
		cart.applyCoupon(coupon);

		cart.getDeliveryCost();
		cart.getTotalAmountAfterDiscounts();

	}

}
