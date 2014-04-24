package com.takeout.domain;
/**
 *  POJO Class Shopcomment
 *  
 *  @author xusen
 *  @version 1.0
 */
public class Shopcomment {
	/** identity		*/
	private long shopComId;
	/** shop's identity */
	private long shopId;
	/** shop's name   */
	private String shopName;
	/** comment text  */
	private String commentText;
	/**  shopReply    */
	private String shopReply;
	
	/**
	 * @return the shopComId
	 */
	public long getShopComId() {
		return shopComId;
	}
	
	/**
	 * @param shopComId the shopComId to set
	 */
	public void setShopComId(long shopComId) {
		this.shopComId = shopComId;
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
	 * @return the commentText
	 */
	public String getCommentText() {
		return commentText;
	}
	
	/**
	 * @param commentText the commentText to set
	 */
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	
	/**
	 * @return the shopReply
	 */
	public String getShopReply() {
		return shopReply;
	}
	
	/**
	 * @param shopReplay the shopReplay to set
	 */
	public void setShopReply(String shopReply) {
		this.shopReply = shopReply;
	}
}
