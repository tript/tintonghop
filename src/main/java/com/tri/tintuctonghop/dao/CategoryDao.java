package com.tri.tintuctonghop.dao;

import java.util.List;

import com.tri.tintuctonghop.model.Category;
import com.tri.tintuctonghop.model.SubCategory;

public interface CategoryDao {
	public void add(Category category);
    public List<Category> list();
    public void delete(Integer id);
	void delete(Category category);
	public void update(Category category);
}
