package com.takeout.domain;

enum LastClient{
	website,anroid,iphone;
}

public class Customer {
	private int customerId;
	private String email;
	private String mobile;
	private String userName;
	private String password;
	private String headUrl;
	private int score;
	private String regTime;
	private LastClient lastClient;
	private int lastCityId;
	private String lastCity;
	private String lastTime;
	private int emailVerified;
	private int mobileVerified;
	private int mobileVerifing;
	private String otherPlatform;
	
	public Customer(int customerId, String email, String mobile,
			String userName, String password, String headUrl, int score,
			String regTime, LastClient lastClient, int lastCityId,
			String lastCity, String lastTime, int emailVerified,
			int mobileVerified, int mobileVerifing, String otherPlatform) {
		super();
		this.customerId = customerId;
		this.email = email;
		this.mobile = mobile;
		this.userName = userName;
		this.password = password;
		this.headUrl = headUrl;
		this.score = score;
		this.regTime = regTime;
		this.lastClient = lastClient;
		this.lastCityId = lastCityId;
		this.lastCity = lastCity;
		this.lastTime = lastTime;
		this.emailVerified = emailVerified;
		this.mobileVerified = mobileVerified;
		this.mobileVerifing = mobileVerifing;
		this.otherPlatform = otherPlatform;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public LastClient getLastClient() {
		return lastClient;
	}

	public void setLastClient(LastClient lastClient) {
		this.lastClient = lastClient;
	}

	public int getLastCityId() {
		return lastCityId;
	}

	public void setLastCityId(int lastCityId) {
		this.lastCityId = lastCityId;
	}

	public String getLastCity() {
		return lastCity;
	}

	public void setLastCity(String lastCity) {
		this.lastCity = lastCity;
	}

	public String getLastTime() {
		return lastTime;
	}

	public void setLastTime(String lastTime) {
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
