package com.takeout.domain;

import java.math.BigDecimal;
/**
 *  POJO Class Region
 *  
 *  @author xusen
 *  @version 1.0
 */
public class Region {
	/** identity		*/
	private long regionId;
	/** region name   */
	private String regionName;
	/** city's identity */
	private long cityId;
	/** city's name   */
	private String cityName;
	/** latitude      */
	private BigDecimal latitude;
	/**  longitude    */
	private BigDecimal longitude;
	/**  zoom's level */
	private byte zoomLevel;
	
	/**
	 * @return the regionId
	 */
	public long getRegionId() {
		return regionId;
	}
	
	/**
	 * @param regionId the regionId to set
	 */
	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}
	
	/**
	 * @return the regionName
	 */
	public String getRegionName() {
		return regionName;
	}
	
	/**
	 * @param regionName the regionName to set
	 */
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	/**
	 * @return the cityId
	 */
	public long getCityId() {
		return cityId;
	}
	
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	/**
	 * @return the latitude
	 */
	public BigDecimal getLatitude() {
		return latitude;
	}
	
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * @return the longitude
	 */
	public BigDecimal getLongitude() {
		return longitude;
	}
	
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * @return the zoomLevel
	 */
	public byte getZoomLevel() {
		return zoomLevel;
	}
	
	/**
	 * @param zoomLevel the zoomLevel to set
	 */
	public void setZoomLevel(byte zoomLevel) {
		this.zoomLevel = zoomLevel;
	}
}
