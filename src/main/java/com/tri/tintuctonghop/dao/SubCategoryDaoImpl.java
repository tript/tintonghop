package com.tri.tintuctonghop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tri.tintuctonghop.model.SubCategory;

@Repository
public class SubCategoryDaoImpl implements SubCategoryDao {
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void add(SubCategory subCategory) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			session.save(subCategory);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}

	@Override
	public List<SubCategory> list() {
		Session session = sessionFactory.openSession();
		try {
			return session.createQuery("from SubCategory").list();
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
			SubCategory subCategory = (SubCategory) session.get(SubCategory.class, id);
			session.delete(subCategory);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void delete(SubCategory subCategory) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			session.delete(subCategory);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void update(SubCategory subcategory) {
		Transaction tx = null;
		Session session = sessionFactory.openSession();
		try{
			tx = session.beginTransaction();
			session.update(subcategory);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
