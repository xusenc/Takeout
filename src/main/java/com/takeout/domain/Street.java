package com.takeout.domain;

import java.math.BigDecimal;

/**
 *  POJO Class Street
 *  
 *  @author xusen
 *  @version 1.0
 */
public class Street {
	/** identity		*/
	private long streetId;
	/** street's name */
	private String streetName;
	/** region's identity */
	private long regionId;
	/** region's name */
	private String regionName;
	/** city's identity   */
	private long cityId;
	/** city's name   */
	private String cityName;
	/** zoom's level  */
	private byte zoomLevel;
	/** latitue       */
	private BigDecimal latitude;
	/** longitude     */
	private BigDecimal longitude;
	
	/**
	 * @return the streetId
	 */
	public long getStreetId() {
		return streetId;
	}
	
	/**
	 * @param streetId the streetId to set
	 */
	public void setStreetId(long streetId) {
		this.streetId = streetId;
	}
	
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
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
}
