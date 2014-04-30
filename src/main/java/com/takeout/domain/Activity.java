package com.takeout.domain;

public class Activity {
	private int activityId;
	private String activityName;
	private String comment;
	private int shopId;
	
	public Activity(int activityId, String activityName, String comment,
			int shopId) {
		super();
		this.activityId = activityId;
		this.activityName = activityName;
		this.comment = comment;
		this.shopId = shopId;
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	
	
}
