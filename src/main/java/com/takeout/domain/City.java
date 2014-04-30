package com.takeout.domain;

import java.math.BigDecimal;

public class City {
	private long cityId;
	private String cityName;
	private BigDecimal latitude;
	private BigDecimal longtitude;
	private int zoomLevel;
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(BigDecimal longtitude) {
		this.longtitude = longtitude;
	}
	public int getZoomLevel() {
		return zoomLevel;
	}
	public void setZoomLevel(int zoomLevel) {
		this.zoomLevel = zoomLevel;
	}
	
	
}
