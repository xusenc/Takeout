package com.takeout.domain;
/**
 *  POJO Class Shopimg
 *  
 *  @author xusen
 *  @version 1.0
 */
public class Shopimg {
	/** identity		*/
	private long shopImgId;
	/** image path    */
	private String imgPath;
	/** shop's identity */
	private long shopId;
	/** picture width   */
	private int width;
	/** picture height  */
	private int height;
	/** is logo         */
	private byte isLogo;
	
	/**
	 * @return the shopImgId
	 */
	public long getShopImgId() {
		return shopImgId;
	}
	
	/**
	 * @param shopImgId the shopImgId to set
	 */
	public void setShopImgId(long shopImgId) {
		this.shopImgId = shopImgId;
	}
	
	/**
	 * @return the imgPath
	 */
	public String getImgPath() {
		return imgPath;
	}
	
	/**
	 * @param imgPath the imgPath to set
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
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
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * @return the isLogo
	 */
	public byte getIsLogo() {
		return isLogo;
	}
	
	/**
	 * @param isLogo the isLogo to set
	 */
	public void setIsLogo(byte isLogo) {
		this.isLogo = isLogo;
	}
}
