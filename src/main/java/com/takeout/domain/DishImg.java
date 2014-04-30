package com.takeout.domain;

public class DishImg {
	private long dishImgId;
	private String imgPath;
	private long dishId;
	private int width;
	private int height;
	public long getDishImgId() {
		return dishImgId;
	}
	public void setDishImgId(long dishImgId) {
		this.dishImgId = dishImgId;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public long getDishId() {
		return dishId;
	}
	public void setDishId(long dishId) {
		this.dishId = dishId;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
