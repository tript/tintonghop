package com.tri.tintuctonghop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tri.tintuctonghop.model.Category;
import com.tri.tintuctonghop.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/servlet-context.xml"		
		})  
@Transactional 
public class Main {
	@Autowired
	private CategoryService categoryService;
	
	@Test
	public void main (){
		Category category = new Category();
		category.setName("test");
		categoryService.add(category);
	}
}
