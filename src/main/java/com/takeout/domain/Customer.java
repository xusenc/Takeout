package com.takeout.domain;

import java.sql.Timestamp;


public class Customer {
	private long customerId;
	private String email;
	private String mobile;
	private String userName;
	private String password;
	private String headUrl;
	private long score;
	private Timestamp regTime;
	private int lastClient;
	private long lastCityId;
	private String lastCity;
	private Timestamp lastTime;
	private int emailVerified;
	private int mobileVerified;
	private int mobileVerifing;
	private String otherPlatform;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public Timestamp getRegTime() {
		return regTime;
	}
	public void setRegTime(Timestamp regTime) {
		this.regTime = regTime;
	}
	public int getLastClient() {
		return lastClient;
	}
	public void setLastClient(int lastClient) {
		this.lastClient = lastClient;
	}
	public long getLastCityId() {
		return lastCityId;
	}
	public void setLastCityId(long lastCityId) {
		this.lastCityId = lastCityId;
	}
	public String getLastCity() {
		return lastCity;
	}
	public void setLastCity(String lastCity) {
		this.lastCity = lastCity;
	}
	public Timestamp getLastTime() {
		return lastTime;
	}
	public void setLastTime(Timestamp lastTime) {
		this.lastTime = lastTime;
	}
	public int getEmailVerified() {
		return emailVerified;
	}
	public void setEmailVerified(int emailVerified) {
		this.emailVerified = emailVerified;
	}
	public int getMobileVerified() {
		return mobileVerified;
	}
	public void setMobileVerified(int mobileVerified) {
		this.mobileVerified = mobileVerified;
	}
	public int getMobileVerifing() {
		return mobileVerifing;
	}
	public void setMobileVerifing(int mobileVerifing) {
		this.mobileVerifing = mobileVerifing;
	}
	public String getOtherPlatform() {
		return otherPlatform;
	}
	public void setOtherPlatform(String otherPlatform) {
		this.otherPlatform = otherPlatform;
	}
	

	
}
