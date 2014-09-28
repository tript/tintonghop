package com.tri.tintuctonghop.service;

import java.util.List;

import com.tri.tintuctonghop.model.Category;

public interface CategoryService {
	public void add(Category category);
    public List<Category> list();
    public void delete(Integer id);
	void delete(Category category);
	public void update(Category category);
}
