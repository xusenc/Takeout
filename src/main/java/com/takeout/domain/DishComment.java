package com.takeout.domain;

public class DishComment {
	private int disComId;
	private String commentText;
	private int dishId;
	private int shopId;
	private int customId;
	private String commentTime;
	private String shopReply;
	
	public DishComment(int disComId, String commentText, int dishId,
			int shopId, int customId, String commentTime, String shopReply) {
		super();
		this.disComId = disComId;
		this.commentText = commentText;
		this.dishId = dishId;
		this.shopId = shopId;
		this.customId = customId;
		this.commentTime = commentTime;
		this.shopReply = shopReply;
	}

	public int getDisComId() {
		return disComId;
	}

	public void setDisComId(int disComId) {
		this.disComId = disComId;
	}

	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getCustomId() {
		return customId;
	}

	public void setCustomId(int customId) {
		this.customId = customId;
	}

	public String getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

	public String getShopReply() {
		return shopReply;
	}

	public void setShopReply(String shopReply) {
		this.shopReply = shopReply;
	}
	
	
}
