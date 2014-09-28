package com.tri.tintuctonghop.dao;

import java.util.List;

import com.tri.tintuctonghop.model.Article;
import com.tri.tintuctonghop.model.Category;

public interface ArticleDao {
	public void add(Article article);
    public List<Article> list();
    public void delete(Integer id);
    public void delete(Article article);
    public void update(Article article);
}
