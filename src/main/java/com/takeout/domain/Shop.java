package com.takeout.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
/**
 *  POJO Class Shop
 *  
 *  @author xusen
 *  @version 1.0
 */
public class Shop {
	/** identity		*/
	private long shopId;
	/** seller's identity */
	private long sellerId;
	/** shop name     */
	private String shopName;
	/** mobile        */
	private String mobile;
	/** city's identity */
	private long cityId;
	/** city's name   */
	private String cityName;
	/** region's identity */
	private long regionId;
	/** region name   */
	private String regionName;
	/** business time */
	private String businessTime;
	/** fee           */
	private BigDecimal fee;
	/** minimal money */
	private BigDecimal minMoney;
	/** discount      */
	private BigDecimal discount;
	/**  notice       */
	private String notice;
	/**  latitude     */
	private BigDecimal latitude;
	/**  longitude    */
	private BigDecimal longitude;
	/**  address      */
	private String address;
	/**  link's man   */
	private String linkman;
	/**  link's phone */
	private String linkPhone;
	/**  last update  */
	private Timestamp lastUpdate;
	/** join in this's time */
	private Date addTime;
	/** click times   */
	private long numClick;
	/** praise times  */
	private long numPraise;
	/** is activity   */
	private byte isActivity;
	/**  activity's identity */
	private long activityId;
	/**  activity's name     */
	private String activityName;
	/** announce's identity  */
	private long announceId;
	/** score         */
	private int score;
	/** email 		   */
	private String email;
	
	/**
	 * @return the shopId
	 */
	public long getShopId() {
		return shopId;
	}
	
	/**
	 * @param shopId the shopId to set
	 */
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	
	/**
	 * @return the sellerId
	 */
	public long getSellerId() {
		return sellerId;
	}
	
	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}
	
	/**
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}
	
	/**
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	 * @return the businessTime
	 */
	public String getBusinessTime() {
		return businessTime;
	}
	
	/**
	 * @param businessTime the businessTime to set
	 */
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}
	
	/**
	 * @return the fee
	 */
	public BigDecimal getFee() {
		return fee;
	}
	
	/**
	 * @param fee the fee to set
	 */
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	
	/**
	 * @return the minMoney
	 */
	public BigDecimal getMinMoney() {
		return minMoney;
	}
	
	/**
	 * @param minMoney the minMoney to set
	 */
	public void setMinMoney(BigDecimal minMoney) {
		this.minMoney = minMoney;
	}
	
	/**
	 * @return the discount
	 */
	public BigDecimal getDiscount() {
		return discount;
	}
	
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	
	/**
	 * @return the notice
	 */
	public String getNotice() {
		return notice;
	}
	
	/**
	 * @param notice the notice to set
	 */
	public void setNotice(String notice) {
		this.notice = notice;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the linkman
	 */
	public String getLinkman() {
		return linkman;
	}
	
	/**
	 * @param linkman the linkman to set
	 */
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	
	/**
	 * @return the linkPhone
	 */
	public String getLinkPhone() {
		return linkPhone;
	}
	
	/**
	 * @param linkPhone the linkPhone to set
	 */
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	
	/**
	 * @return the lastUpdate
	 */
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}
	
	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	/**
	 * @return the addTime
	 */
	public Date getAddTime() {
		return addTime;
	}
	
	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
	/**
	 * @return the numClick
	 */
	public long getNumClick() {
		return numClick;
	}
	
	/**
	 * @param numClick the numClick to set
	 */
	public void setNumClick(long numClick) {
		this.numClick = numClick;
	}
	
	/**
	 * @return the numPraise
	 */
	public long getNumPraise() {
		return numPraise;
	}
	
	/**
	 * @param numPraise the numPraise to set
	 */
	public void setNumPraise(long numPraise) {
		this.numPraise = numPraise;
	}
	
	/**
	 * @return the isActivity
	 */
	public byte getIsActivity() {
		return isActivity;
	}
	
	/**
	 * @param isActivity the isActivity to set
	 */
	public void setIsActivity(byte isActivity) {
		this.isActivity = isActivity;
	}
	
	/**
	 * @return the activityId
	 */
	public long getActivityId() {
		return activityId;
	}
	
	/**
	 * @param activityId the activityId to set
	 */
	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}
	
	/**
	 * @return the activityName
	 */
	public String getActivityName() {
		return activityName;
	}
	
	/**
	 * @param activityName the activityName to set
	 */
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	
	/**
	 * @return the announceId
	 */
	public long getAnnounceId() {
		return announceId;
	}
	
	/**
	 * @param announceId the announceId to set
	 */
	public void setAnnounceId(long announceId) {
		this.announceId = announceId;
	}
	
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
