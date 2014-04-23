package com.takeout.domain;

import java.sql.Timestamp;
/**
 *  POJO Class Seller
 *  
 *  @author xusen
 *  @version 1.0
 */
public class Seller {
	/** identity		*/
	private long sellerId;
	/** seller name   */
	private String sellerName;
	/** password      */
	private String password;
	/** register time */
	private Timestamp regTime;
	/** seller's head pic */
	private String sellerHead;
	/** seller's info */
	private String sellerInfo;
	/** shop's identity */
	private long shopId;
	/** shop's name   */
	private String shopName;
	
	/**
	 * @return the sellerId
	 */
	public long getSellerId() {
		return sellerId;
	}
	
	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}
	
	/**
	 * @return the sellerName
	 */
	public String getSellerName() {
		return sellerName;
	}
	
	/**
	 * @param sellerName the sellerName to set
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return the regTime
	 */
	public Timestamp getRegTime() {
		return regTime;
	}
	
	/**
	 * @param regTime the regTime to set
	 */
	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}
	
	/**
	 * @return the sellerHead
	 */
	public String getSellerHead() {
		return sellerHead;
	}
	
	/**
	 * @param sellerHead the sellerHead to set
	 */
	public void setSellerHead(String sellerHead) {
		this.sellerHead = sellerHead;
	}
	
	/**
	 * @return the sellerInfo
	 */
	public String getSellerInfo() {
		return sellerInfo;
	}
	
	/**
	 * @param sellerInfo the sellerInfo to set
	 */
	public void setSellerInfo(String sellerInfo) {
		this.sellerInfo = sellerInfo;
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
