package com.tri.tintuctonghop.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subcategory", catalog = "tintuctonghop")
public class SubCategory {
	private Integer id;
	private String name;
	private Category category;
	private Set<Article> articles = new HashSet<Article>(
			0);

	public SubCategory() {
	}

	public SubCategory(String name, Category category) {
		this.name = name;
		this.category = category;
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

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	public Category getCategory() {
		return this.category;
	}
 
	public void setCategory(Category category) {
		this.category = category;
	}
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subCategory")
	public Set<Article> getArticles() {
		return this.articles;
	}
 
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
}
