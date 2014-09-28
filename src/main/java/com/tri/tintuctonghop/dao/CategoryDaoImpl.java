package com.tri.tintuctonghop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tri.tintuctonghop.model.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void add(Category category) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			session.save(category);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}

	@Override
	public List<Category> list() {
		Session session = sessionFactory.openSession();
		try {
			return session.createQuery("from Category").list();
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
			Category category = (Category) session.get(Category.class, id);
			session.delete(category);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void delete(Category category) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			session.delete(category);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void update(Category category) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			session.update(category);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
