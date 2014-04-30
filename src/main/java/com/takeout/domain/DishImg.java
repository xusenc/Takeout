package com.takeout.domain;

public class DishImg {
	private int dishImgId;
	private String imgPath;
	private int dishId;
	private int width;
	private int height;
	
	public DishImg(int dishImgId, String imgPath, int dishId, int width,
			int height) {
		super();
		this.dishImgId = dishImgId;
		this.imgPath = imgPath;
		this.dishId = dishId;
		this.width = width;
		this.height = height;
	}

	public int getDishImgId() {
		return dishImgId;
	}

	public void setDishImgId(int dishImgId) {
		this.dishImgId = dishImgId;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
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
