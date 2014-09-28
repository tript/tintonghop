package com.tri.tintuctonghop.service;

import java.util.List;

import com.tri.tintuctonghop.model.Article;

public interface ArticleService {
	public void add(Article article);
    public List<Article> list();
    public void delete(Integer id);
    public void delete(Article article);
    public void update(Article article);
}
