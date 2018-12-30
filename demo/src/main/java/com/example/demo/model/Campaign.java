package com.example.demo.model;

import com.example.demo.common.DiscountType;

public class Campaign {

	private Category category;
	private double ratio;
	private int itemCount;
	private DiscountType discountType;

	public Campaign() {
		super();
	}

	public Campaign(Category category, double ratio, int itemCount, DiscountType discountType) {
		super();
		this.category = category;
		this.ratio = ratio;
		this.itemCount = itemCount;
		this.discountType = discountType;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getRatio() {
		return ratio;
	}

	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public DiscountType getDiscountType() {
		return discountType;
	}

	public void setDiscountType(DiscountType discountType) {
		this.discountType = discountType;
	}

}
