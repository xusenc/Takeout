package com.takeout.domain;


import java.math.BigDecimal;

/**
 *  POJO Class Orderitem
 *  
 *  @author xusen
 *  @version 1.0
 */
public class Orderitem {
	/** identity		*/
	private long itemId;
	/** order's identity		*/
	private long orderId;
	/** dishId's identity   */
	private long dishId;
	/**  dish name          */
	private String dishName;
	/**  price       */
	private BigDecimal price;
	/**  count       */
	private int count;
	/**   shop's identity  */
	private long shopId;
	/** shop's name  */
	private String shopName;
	
	/**
	 * @return the itemId
	 */
	public long getItemId() {
		return itemId;
	}
	
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}
	
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	/**
	 * @return the dishId
	 */
	public long getDishId() {
		return dishId;
	}
	
	/**
	 * @param dishId the dishId to set
	 */
	public void setDishId(long dishId) {
		this.dishId = dishId;
	}
	
	/**
	 * @return the dishName
	 */
	public String getDishName() {
		return dishName;
	}
	
	/**
	 * @param dishName the dishName to set
	 */
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	/**
	 * @return the shopId
	 */
	public long getShopId() {
		return shopId;
	}
	
	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	
	/**
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}
	
	/**
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}
