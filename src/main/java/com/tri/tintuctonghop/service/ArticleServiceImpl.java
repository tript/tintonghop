package com.tri.tintuctonghop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tri.tintuctonghop.dao.ArticleDao;
import com.tri.tintuctonghop.model.Article;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public void add(Article article) {
		articleDao.add(article);
	}

	@Override
	public List<Article> list() {
		return articleDao.list();
	}

	@Override
	public void delete(Integer id) {
		articleDao.delete(id);
	}

	@Override
	public void delete(Article article) {
		articleDao.delete(article);
	}

	@Override
	public void update(Article article) {
		articleDao.update(article);
	}

}
