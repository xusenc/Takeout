package com.takeout.domain;

public class Activity {
	private long activityId;
	private String activityName;
	private String comtent;
	private long shopId;
	

	public long getActivityId() {
		return activityId;
	}

	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}


	public String getComtent() {
		return comtent;
	}

	public void setComtent(String comtent) {
		this.comtent = comtent;
	}

	public long getShopId() {
		return shopId;
	}

	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	
	
}
