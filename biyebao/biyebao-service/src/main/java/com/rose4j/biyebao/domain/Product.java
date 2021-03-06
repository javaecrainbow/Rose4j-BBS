package com.rose4j.biyebao.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Product implements Serializable, Cloneable {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.ID
	 * 
	 * @mbggenerated
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.VERSION
	 * 
	 * @mbggenerated
	 */
	private Integer version;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.name
	 * 
	 * @mbggenerated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.price
	 * 
	 * @mbggenerated
	 */
	private BigDecimal price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.db_type
	 * 
	 * @mbggenerated
	 */
	private String dbType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.summary
	 * 
	 * @mbggenerated
	 */
	private String summary;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.weights
	 * 
	 * @mbggenerated
	 */
	private Integer weights;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.add_time
	 * 
	 * @mbggenerated
	 */
	private Date addTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.adder_name
	 * 
	 * @mbggenerated
	 */
	private String adderName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.lang_type
	 * 
	 * @mbggenerated
	 */
	private String langType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.post_time
	 * 
	 * @mbggenerated
	 */
	private Date postTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.sale_num
	 * 
	 * @mbggenerated
	 */
	private Integer saleNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.source_type
	 * 
	 * @mbggenerated
	 */
	private String sourceType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.update_time
	 * 
	 * @mbggenerated
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.updater_name
	 * 
	 * @mbggenerated
	 */
	private String updaterName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.view_num
	 * 
	 * @mbggenerated
	 */
	private Integer viewNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.recommend
	 * 
	 * @mbggenerated
	 */
	private String recommend;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column goods.description
	 * 
	 * @mbggenerated
	 */
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.ID
	 * 
	 * @return the value of goods.ID
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.ID
	 * 
	 * @param id
	 *            the value for goods.ID
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.VERSION
	 * 
	 * @return the value of goods.VERSION
	 * @mbggenerated
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.VERSION
	 * 
	 * @param version
	 *            the value for goods.VERSION
	 * @mbggenerated
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.name
	 * 
	 * @return the value of goods.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.name
	 * 
	 * @param name
	 *            the value for goods.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.price
	 * 
	 * @return the value of goods.price
	 * @mbggenerated
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.price
	 * 
	 * @param price
	 *            the value for goods.price
	 * @mbggenerated
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.db_type
	 * 
	 * @return the value of goods.db_type
	 * @mbggenerated
	 */
	public String getDbType() {
		return dbType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.db_type
	 * 
	 * @param dbType
	 *            the value for goods.db_type
	 * @mbggenerated
	 */
	public void setDbType(String dbType) {
		this.dbType = dbType == null ? null : dbType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.summary
	 * 
	 * @return the value of goods.summary
	 * @mbggenerated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.summary
	 * 
	 * @param summary
	 *            the value for goods.summary
	 * @mbggenerated
	 */
	public void setSummary(String summary) {
		this.summary = summary == null ? null : summary.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.weights
	 * 
	 * @return the value of goods.weights
	 * @mbggenerated
	 */
	public Integer getWeights() {
		return weights;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.weights
	 * 
	 * @param weights
	 *            the value for goods.weights
	 * @mbggenerated
	 */
	public void setWeights(Integer weights) {
		this.weights = weights;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.add_time
	 * 
	 * @return the value of goods.add_time
	 * @mbggenerated
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.add_time
	 * 
	 * @param addTime
	 *            the value for goods.add_time
	 * @mbggenerated
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.adder_name
	 * 
	 * @return the value of goods.adder_name
	 * @mbggenerated
	 */
	public String getAdderName() {
		return adderName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.adder_name
	 * 
	 * @param adderName
	 *            the value for goods.adder_name
	 * @mbggenerated
	 */
	public void setAdderName(String adderName) {
		this.adderName = adderName == null ? null : adderName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.lang_type
	 * 
	 * @return the value of goods.lang_type
	 * @mbggenerated
	 */
	public String getLangType() {
		return langType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.lang_type
	 * 
	 * @param langType
	 *            the value for goods.lang_type
	 * @mbggenerated
	 */
	public void setLangType(String langType) {
		this.langType = langType == null ? null : langType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.post_time
	 * 
	 * @return the value of goods.post_time
	 * @mbggenerated
	 */
	public Date getPostTime() {
		return postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.post_time
	 * 
	 * @param postTime
	 *            the value for goods.post_time
	 * @mbggenerated
	 */
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.sale_num
	 * 
	 * @return the value of goods.sale_num
	 * @mbggenerated
	 */
	public Integer getSaleNum() {
		return saleNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.sale_num
	 * 
	 * @param saleNum
	 *            the value for goods.sale_num
	 * @mbggenerated
	 */
	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.source_type
	 * 
	 * @return the value of goods.source_type
	 * @mbggenerated
	 */
	public String getSourceType() {
		return sourceType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.source_type
	 * 
	 * @param sourceType
	 *            the value for goods.source_type
	 * @mbggenerated
	 */
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType == null ? null : sourceType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.update_time
	 * 
	 * @return the value of goods.update_time
	 * @mbggenerated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.update_time
	 * 
	 * @param updateTime
	 *            the value for goods.update_time
	 * @mbggenerated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.updater_name
	 * 
	 * @return the value of goods.updater_name
	 * @mbggenerated
	 */
	public String getUpdaterName() {
		return updaterName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.updater_name
	 * 
	 * @param updaterName
	 *            the value for goods.updater_name
	 * @mbggenerated
	 */
	public void setUpdaterName(String updaterName) {
		this.updaterName = updaterName == null ? null : updaterName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.view_num
	 * 
	 * @return the value of goods.view_num
	 * @mbggenerated
	 */
	public Integer getViewNum() {
		return viewNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.view_num
	 * 
	 * @param viewNum
	 *            the value for goods.view_num
	 * @mbggenerated
	 */
	public void setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.recommend
	 * 
	 * @return the value of goods.recommend
	 * @mbggenerated
	 */
	public String getRecommend() {
		return recommend;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.recommend
	 * 
	 * @param recommend
	 *            the value for goods.recommend
	 * @mbggenerated
	 */
	public void setRecommend(String recommend) {
		this.recommend = recommend == null ? null : recommend.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column goods.description
	 * 
	 * @return the value of goods.description
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column goods.description
	 * 
	 * @param description
	 *            the value for goods.description
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", version=" + version + ", name=" + name
				+ ", price=" + price + ", dbType=" + dbType + ", summary="
				+ summary + ", weights=" + weights + ", addTime=" + addTime
				+ ", adderName=" + adderName + ", langType=" + langType
				+ ", postTime=" + postTime + ", saleNum=" + saleNum
				+ ", sourceType=" + sourceType + ", updateTime=" + updateTime
				+ ", updaterName=" + updaterName + ", viewNum=" + viewNum
				+ ", recommend=" + recommend + ", description=" + description
				+ "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
