package com.tri.tintuctonghop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tri.tintuctonghop.dao.CategoryDao;
import com.tri.tintuctonghop.model.Category;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public void add(Category category) {
		categoryDao.add(category);
	}

	@Override
	public List<Category> list() {
		return categoryDao.list();
	}

	@Override
	public void delete(Integer id) {
		categoryDao.delete(id);
	}

	@Override
	public void delete(Category category) {
		categoryDao.delete(category);
	}

	@Override
	public void update(Category category) {
		categoryDao.update(category);
	}
}
