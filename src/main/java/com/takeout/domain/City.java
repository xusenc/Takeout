package com.takeout.domain;

public class City {
	private int cityId;
	private String cityName;
	private double latitude;
	private double longtitude;
	private int zoomLevel;
	
	public City(int cityId, String cityName, double latitude,
			double longtitude, int zoomLevel) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.zoomLevel = zoomLevel;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}

	public int getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(int zoomLevel) {
		this.zoomLevel = zoomLevel;
	}
	
	
	
}
