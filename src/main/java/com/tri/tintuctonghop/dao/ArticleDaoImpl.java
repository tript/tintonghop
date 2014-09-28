package com.tri.tintuctonghop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tri.tintuctonghop.model.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void add(Article article) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			session.save(article);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}

	@Override
	public List<Article> list() {
		Session session = sessionFactory.openSession();
		try {
			return session.createQuery("from article").list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			Article article = (Article) session.get(Article.class, id);
			session.delete(article);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void delete(Article article) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			session.delete(article);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void update(Article article) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			session.update(article);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
