package com.takeout.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 *  POJO Class Orders
 *  
 *  @author xusen
 *  @version 1.0
 */
public class Orders {
	/** identity		*/
	private long orderId;
	/** customer's identity */
	private long customerId;
	/**  shop's identity    */
	private long shopId;
	/**   mobile		*/
	private String mobile;
	/**	address     */
	private String address;
	/**   create time */
	private Timestamp createTime;
	/**   end time    */
	private Timestamp endTime;
	/** 	total price */
	private BigDecimal total;
	/**   order status*/
	private byte status;
	/** 	notes			*/
	private String notes;
	/**   customer operation */
	private byte cusOperation;
	/**   is urged    */
	private byte isUrged;
	/**   arrive time */
	private Timestamp arriveTime;
	/**   discount    */
	private BigDecimal discount;
	/**   after discout, total money */
	private BigDecimal discountTotal;
	
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
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}
	
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	/**
	 * @return the createTime
	 */
	public Timestamp getCreateTime() {
		return createTime;
	}
	
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}
	
	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	/**
	 * @return the status
	 */
	public byte getStatus() {
		return status;
	}
	
	/**
	 * @param status the status to set
	 */
	public void setStatus(byte status) {
		this.status = status;
	}
	
	/**
	 * @return the cusOperation
	 */
	public byte getCusOperation() {
		return cusOperation;
	}
	
	/**
	 * @param cusOperation the cusOperation to set
	 */
	public void setCusOperation(byte cusOperation) {
		this.cusOperation = cusOperation;
	}
	
	/**
	 * @return the isUrged
	 */
	public byte getIsUrged() {
		return isUrged;
	}
	
	/**
	 * @param isUrged the isUrged to set
	 */
	public void setIsUrged(byte isUrged) {
		this.isUrged = isUrged;
	}
	
	/**
	 * @return the endTime
	 */
	public Timestamp getEndTime() {
		return endTime;
	}
	
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	
	/**
	 * @return the discount
	 */
	public BigDecimal getDiscount() {
		return discount;
	}
	
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	/**
	 * @return the arriveTime
	 */
	public Timestamp getArriveTime() {
		return arriveTime;
	}

	/**
	 * @param arriveTime the arriveTime to set
	 */
	public void setArriveTime(Timestamp arriveTime) {
		this.arriveTime = arriveTime;
	}

	/**
	 * @return the discountTotal
	 */
	public BigDecimal getDiscountTotal() {
		return discountTotal;
	}

	/**
	 * @param discountTotal the discountTotal to set
	 */
	public void setDiscountTotal(BigDecimal discountTotal) {
		this.discountTotal = discountTotal;
	}

	/**
	 * @param cusOperation the cusOperation to set
	 */
	public void setCusOperation(Byte cusOperation) {
		this.cusOperation = cusOperation;
	}
}
