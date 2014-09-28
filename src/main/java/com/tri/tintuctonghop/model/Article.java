package com.tri.tintuctonghop.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "article", catalog = "tintuctonghop")
public class Article {
	private Integer id;
	private String title;
	private String summary;
	private Date uploadDate;
	private String url;
	private SubCategory subcategory;

	public Article() {
	}
	public Article(SubCategory subcategory){
		this.subcategory = subcategory;
	}
	public Article(String title, String summary,Date uploadDate,String url,SubCategory subcategory) {
		this.title = title;
		this.setSummary(summary);
		this.setUploadDate(uploadDate);
		this.setUrl(url);
		this.subcategory = subcategory;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "title", length = 200)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subcategory_id", nullable = false)
	public SubCategory getSubCategory() {
		return this.subcategory;
	}
 
	public void setSubCategory(SubCategory subCategory) {
		this.subcategory = subCategory;
	}
	
	@Column(name = "summary", length = 500)
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "upload_date")
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	
	@Column(name = "url", length = 500)
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
