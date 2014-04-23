package com.takeout.domain;

import java.sql.Timestamp;
/**
 *  POJO Class Section
 *  
 *  @author xusen
 *  @version 1.0
 */
public class Section {
	/** identity		*/
	private long sectionId;
	/** section name  */
	private String sectionName;
	/** shop's identity */
	private long shopId;
	/** shop's name    */
	private String shopName;
	/** accept order   */
	private byte acceptOrder;
	/**  last update   */
	private Timestamp lastUpdate;
	
	/**
	 * @return the sectionId
	 */
	public long getSectionId() {
		return sectionId;
	}
	
	/**
	 * @param sectionId the sectionId to set
	 */
	public void setSectionId(long sectionId) {
		this.sectionId = sectionId;
	}
	
	/**
	 * @return the sectionName
	 */
	public String getSectionName() {
		return sectionName;
	}
	
	/**
	 * @param sectionName the sectionName to set
	 */
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
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
	
	/**
	 * @return the acceptOrder
	 */
	public byte getAcceptOrder() {
		return acceptOrder;
	}
	
	/**
	 * @param acceptOrder the acceptOrder to set
	 */
	public void setAcceptOrder(byte acceptOrder) {
		this.acceptOrder = acceptOrder;
	}
	
	/**
	 * @return the lastUpdate
	 */
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	
	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
