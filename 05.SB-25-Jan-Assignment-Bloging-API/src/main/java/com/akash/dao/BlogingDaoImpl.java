package com.akash.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Bloging;

@Repository
public class BlogingDaoImpl implements BlogingDao {
	
	@Autowired
	SessionFactory sf;
	
	
	@Override
	public List<Bloging> getAllData() {
		Session session=sf.openSession();
		
		Query query=session.createQuery("from Bloging");
		
		List<Bloging> list=query.list();
		return list;
		
	}
	@Override
	public Bloging insertSinglePost(@RequestBody Bloging bloging) {
		Session session=sf.openSession();
		  Transaction transaction=session.beginTransaction();
		  
		  session.save(bloging);
		  transaction.commit();
		  return bloging;
		
		
	}

	@Override
	public Bloging ShowSingleData(@PathVariable int id) {
		Session session=sf.openSession();
		
		Bloging bloging=session.get(Bloging.class, id);
		session.save(bloging);
		return bloging;
		
	}
	@Override
	public Bloging updateSingleData(@RequestBody Bloging bloging) {
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.save(bloging);
		transaction.commit();
		return bloging;
		
	}
	
	@Override
	public List<Bloging> updateMulData(@RequestBody List<Bloging> list) {
		for (Bloging bloging : list) {
			Session session=sf.openSession();
			
			Transaction transaction=session.beginTransaction();
			session.update(bloging);
			transaction.commit();
			
		}
		return list;
		
	}

	@Override
	public Bloging deleteSingleData(@RequestBody int id) {
		Session session=sf.openSession();
		
		Transaction transaction=session.beginTransaction();
		Bloging bloging=session.get(Bloging.class, id);
		
		session.delete(bloging);
		transaction.commit();
		return bloging;
		
	}
}
