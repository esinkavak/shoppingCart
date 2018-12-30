package com.example.demo.model;

public class DeliveryCostCalculator {

	private double fixedCost;
	private double costPerDelivery;
	private int numberOfDeliveries;
	private double costPerProduct;
	private int numberOfProducts;

	public DeliveryCostCalculator() {
		super();
	}

	public DeliveryCostCalculator(double costPerDelivery, double costPerProduct, double fixedCost) {
		super();
		this.costPerDelivery = costPerDelivery;
		this.costPerProduct = costPerProduct;
		this.fixedCost = fixedCost;
	}

	public DeliveryCostCalculator(double costPerDelivery, int numberOfDeliveries, double costPerProduct,
			int numberOfProducts) {
		super();
		this.costPerDelivery = costPerDelivery;
		this.numberOfDeliveries = numberOfDeliveries;
		this.costPerProduct = costPerProduct;
		this.numberOfProducts = numberOfProducts;
	}

	public double getCostPerDelivery() {
		return costPerDelivery;
	}

	public void setCostPerDelivery(double costPerDelivery) {
		this.costPerDelivery = costPerDelivery;
	}

	public int getNumberOfDeliveries() {
		return numberOfDeliveries;
	}

	public void setNumberOfDeliveries(int numberOfDeliveries) {
		this.numberOfDeliveries = numberOfDeliveries;
	}

	public double getCostPerProduct() {
		return costPerProduct;
	}

	public void setCostPerProduct(double costPerProduct) {
		this.costPerProduct = costPerProduct;
	}

	public int getNumberOfProducts() {
		return numberOfProducts;
	}

	public void setNumberOfProducts(int numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}

	public double getFixedCost() {
		return fixedCost;
	}

	public void setFixedCost(double fixedCost) {
		this.fixedCost = fixedCost;
	}

}
