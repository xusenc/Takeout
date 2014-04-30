package com.takeout.domain;

public class Announcement {
	private long annouceId;
	private String content;
	private long shopId;
	private String image;	

	public long getAnnouceId() {
		return annouceId;
	}

	public void setAnnouceId(long annouceId) {
		this.annouceId = annouceId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getShopId() {
		return shopId;
	}

	public void setShopId(long shopId) {
		this.shopId = shopId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
