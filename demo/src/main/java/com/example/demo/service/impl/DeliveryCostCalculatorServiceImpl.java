package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.model.DeliveryCostCalculator;
import com.example.demo.service.DeliveryCostCalculatorService;
import com.example.demo.service.ShoppingCartService;

@Service
public class DeliveryCostCalculatorServiceImpl implements DeliveryCostCalculatorService {

	// TODO: maybe from repository
	public double costPerDelivery = 1;
	public double costPerProduct = 1;
	public static final double fixedCost = 2.99;

	@Override
	public double calculatefor(ShoppingCartService cart) {

		double deliveryCost = 0;
		DeliveryCostCalculator dc = new DeliveryCostCalculator(costPerDelivery, costPerProduct, fixedCost);
		deliveryCost = (dc.getCostPerDelivery() * dc.getNumberOfDeliveries())
				+ (dc.getCostPerProduct() * dc.getNumberOfProducts()) + (dc.getFixedCost());

		System.out.println("deliveryCost:" + deliveryCost);

		return deliveryCost;
	}

}
