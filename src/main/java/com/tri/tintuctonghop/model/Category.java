package com.tri.tintuctonghop.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category", catalog = "tintuctonghop")
public class Category {
	private Integer id;
	private String name;
	private Set<SubCategory> subCategories = new HashSet<SubCategory>(
			0);

	public Category() {
	}

	public Category(String name, Set<SubCategory> subCategories) {
		this.name = name;
		this.subCategories = subCategories;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<SubCategory> getSubCategories() {
		return this.subCategories;
	}
 
	public void setSubCategories(Set<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}
}
