package com.akash.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Mobile;

@Repository
public class MobileDaoImpl implements MobileDao {

	@Autowired
	SessionFactory sf;

	@Override
	public List<Mobile> ShowAllData() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Mobile");
		List<Mobile> list = query.list();

		return list;
	}

	@Override
	public Mobile inserDataRecBody(@RequestBody Mobile mob) {

		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(mob);

		transaction.commit();
		return  mob;
	}

	@Override
	public Mobile getDataAPI(@PathVariable int id) {

		Session session = sf.openSession();

		Mobile mob = session.get(Mobile.class, id);

		session.save(mob);
		return  mob;

	}

}
