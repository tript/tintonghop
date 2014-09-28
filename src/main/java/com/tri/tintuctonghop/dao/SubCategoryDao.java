package com.tri.tintuctonghop.dao;

import java.util.List;

import com.tri.tintuctonghop.model.SubCategory;

public interface SubCategoryDao {
	public void add(SubCategory subCategory);
    public List<SubCategory> list();
    public void delete(Integer id);
	void delete(SubCategory subCategory);
	public void update(SubCategory subcategory);
}
