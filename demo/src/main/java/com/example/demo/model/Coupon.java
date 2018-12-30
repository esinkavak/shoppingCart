package com.example.demo.model;

import com.example.demo.common.DiscountType;

public class Coupon {

	private int minPurchase;
	private int ratio;
	private DiscountType discountType;

	public Coupon() {
		super();
	}

	public Coupon(int minPurchase, int ratio, DiscountType discountType) {
		super();
		this.minPurchase = minPurchase;
		this.ratio = ratio;
		this.discountType = discountType;
	}

	public int getMinPurchase() {
		return minPurchase;
	}

	public void setMinPurchase(int minPurchase) {
		this.minPurchase = minPurchase;
	}

	public int getRatio() {
		return ratio;
	}

	public void setRatio(int ratio) {
		this.ratio = ratio;
	}

	public DiscountType getDiscountType() {
		return discountType;
	}

	public void setDiscountType(DiscountType discountType) {
		this.discountType = discountType;
	}

}
