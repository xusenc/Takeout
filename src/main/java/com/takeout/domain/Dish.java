package com.takeout.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Dish {
	private long dishId;
	private String dishName;
	private long sectionId;
	private String sectionName;
	private long shopId;
	private String shopName;
	private String annotation;
	private BigDecimal price;
	private BigDecimal discountPrice;
	private int acceptOrder;
	private Timestamp lastUpdate;
	private int isDiscount;
	private int numClick;
	private int numPraise;
	public long getDishId() {
		return dishId;
	}
	public void setDishId(long dishId) {
		this.dishId = dishId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public long getSectionId() {
		return sectionId;
	}
	public void setSectionId(long sectionId) {
		this.sectionId = sectionId;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(BigDecimal discountPrice) {
		this.discountPrice = discountPrice;
	}
	public int getAcceptOrder() {
		return acceptOrder;
	}
	public void setAcceptOrder(int acceptOrder) {
		this.acceptOrder = acceptOrder;
	}
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Timestamp lastUpdate) {
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
