package com.takeout.domain;

public class Annoucement {
	private int annouceId;
	private String content;
	private int shopId;
	private String image;
	
	public Annoucement(int annouceId, String content, int shopId, String image) {
		super();
		this.annouceId = annouceId;
		this.content = content;
		this.shopId = shopId;
		this.image = image;
	}

	public int getAnnouceId() {
		return annouceId;
	}

	public void setAnnouceId(int annouceId) {
		this.annouceId = annouceId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
