package com.takeout.domain;

public class Dish {
	private int dishId;
	private String dishName;
	private int sectionId;
	private String sectionName;
	private int shopId;
	private String shopName;
	private String annotation;
	private double price;
	private double discountPrice;
	private int acceptOrder;
	private String lastUpdate;
	private int isDiscount;
	private int numClick;
	private int numPraise;
	public Dish(int dishId, String dishName, int sectionId, String sectionName,
			int shopId, String shopName, String annotation, double price,
			double discountPrice, int acceptOrder, String lastUpdate,
			int isDiscount, int numClick, int numPraise) {
		super();
		this.dishId = dishId;
		this.dishName = dishName;
		this.sectionId = sectionId;
		this.sectionName = sectionName;
		this.shopId = shopId;
		this.shopName = shopName;
		this.annotation = annotation;
		this.price = price;
		this.discountPrice = discountPrice;
		this.acceptOrder = acceptOrder;
		this.lastUpdate = lastUpdate;
		this.isDiscount = isDiscount;
		this.numClick = numClick;
		this.numPraise = numPraise;
	}
	public int getDishId() {
		return dishId;
	}
	public void setDishId(int dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getSectionId() {
		return sectionId;
	}
	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getAnnotation() {
		return annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public int getAcceptOrder() {
		return acceptOrder;
	}
	public void setAcceptOrder(int acceptOrder) {
		this.acceptOrder = acceptOrder;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public int getIsDiscount() {
		return isDiscount;
	}
	public void setIsDiscount(int isDiscount) {
		this.isDiscount = isDiscount;
	}
	public int getNumClick() {
		return numClick;
	}
	public void setNumClick(int numClick) {
		this.numClick = numClick;
	}
	public int getNumPraise() {
		return numPraise;
	}
	public void setNumPraise(int numPraise) {
		this.numPraise = numPraise;
	}
	
}
