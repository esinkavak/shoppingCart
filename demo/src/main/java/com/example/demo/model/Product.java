package com.example.demo.model;

public class Product {

	private String title;
	private double price;
	private Category category;
	private double reducedPrice;

	public Product() {
		super();
	}

	public Product(String title, double price, Category category) {
		super();
		this.title = title;
		this.price = price;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getReducedPrice() {
		return reducedPrice;
	}

	public void setReducedPrice(double reducedPrice) {
		this.reducedPrice = reducedPrice;
	}

}
