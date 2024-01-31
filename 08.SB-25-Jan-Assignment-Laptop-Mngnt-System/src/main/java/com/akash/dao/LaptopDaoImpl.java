package com.akash.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.model.Laptop;

@Repository
public class LaptopDaoImpl implements LaptopDao {

	@Autowired
	SessionFactory sf;

	/*
	 * @GetMapping("showMultipleRecords") public List<Laptop> ShowAllData() {
	 * Session session = sf.openSession(); Query query =
	 * session.createQuery("from Laptop"); List<Laptop> list = query.list();
	 * 
	 * return list; }
	 */

//	@PostMapping("insertSingleRecordBody") //here problem occurs here 
	@Override
	public Laptop insertSingleRecBody(@RequestBody Laptop laptop) {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		session.save(laptop);
		t.commit();
		return laptop;
	}

	@Override
	public  List<Laptop> ShowAllData() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Laptop");
		List<Laptop> list = query.list();

		return  list;
	}

	@Override
	public Laptop SingleRecAPI(@PathVariable int id) {
		Session session = sf.openSession();

		Laptop laptop = session.get(Laptop.class, id);
		session.close();

		return laptop;
	}

	@Override
	public Laptop updateSingleBody(@RequestBody Laptop laptop) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(laptop);
		transaction.commit();
		return laptop;
	}

	@Override
	public List<Laptop> multipleUpdate(@RequestBody List<Laptop> list) {

		for (Laptop laptop : list) {
			Session ss = sf.openSession();
			Transaction transaction = ss.beginTransaction();
			ss.update(laptop);
			transaction.commit();
		}
		return list;
	}

	@Override
	public Laptop deleteSingleAPI(@PathVariable int id) {

		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();
		Laptop laptop = session.load(Laptop.class, id);
		session.delete(laptop);
		transaction.commit();

		return laptop;

	}

}
