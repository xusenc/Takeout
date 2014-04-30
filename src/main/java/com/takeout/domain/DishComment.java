package com.takeout.domain;

import java.sql.Timestamp;

public class DishComment {
	private long disComId;
	private String commentText;
	private long dishId;
	private long shopId;
	private long customId;
	private Timestamp commentTime;
	private String shopReply;
	private long customerId;

	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getDisComId() {
		return disComId;
	}
	public void setDisComId(long disComId) {
		this.disComId = disComId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	public long getDishId() {
		return dishId;
	}
	public void setDishId(long dishId) {
		this.dishId = dishId;
	}
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public long getCustomId() {
		return customId;
	}
	public void setCustomId(long customId) {
		this.customId = customId;
	}
	
	public Timestamp getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Timestamp commentTime) {
		this.commentTime = commentTime;
	}
	public String getShopReply() {
		return shopReply;
	}
	public void setShopReply(String shopReply) {
		this.shopReply = shopReply;
	}
	
	
}
