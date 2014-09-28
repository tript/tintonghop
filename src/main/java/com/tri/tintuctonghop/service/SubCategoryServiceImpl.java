package com.tri.tintuctonghop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tri.tintuctonghop.dao.SubCategoryDao;
import com.tri.tintuctonghop.model.SubCategory;

@Service("subsubCategoryService")
public class SubCategoryServiceImpl implements SubCategoryService{
	@Autowired
	private SubCategoryDao subCategoryDao;
	
	@Override
	public void add(SubCategory subCategory) {
		subCategoryDao.add(subCategory);
	}

	@Override
	public List<SubCategory> list() {
		return subCategoryDao.list();
	}

	@Override
	public void delete(Integer id) {
		subCategoryDao.delete(id);
	}

	@Override
	public void delete(SubCategory subCategory) {
		subCategoryDao.delete(subCategory);
	}

	@Override
	public void update(SubCategory subCategory) {
		subCategoryDao.update(subCategory);
	}
}
