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
import org.springframework.web.bind.annotation.RestController;

import com.akash.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	SessionFactory sf;

	@Override
	public List<Product> showAllData() {

		Session session = sf.openSession();

		Query query = session.createQuery("from Product");

		List<Product> list = query.list();

		return list;
	}

	@Override
	public Product insertData(@RequestBody Product pd) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(pd);
		transaction.commit();
		return pd;

	}

	@Override
	public Product GetData(@PathVariable int id) {
		Session session = sf.openSession();

		Product pd = session.get(Product.class, id);

		return pd;

	}

	@Override
	public Product updateData(@RequestBody Product pd) {

		Session session = sf.openSession();

		Transaction transaction = session.beginTransaction();
		session.update(pd);
		transaction.commit();
		return pd;

	}

	@Override
	public Product deleteData(@PathVariable int id) {

		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		Product pd = session.get(Product.class, id);
		transaction.commit();

		return pd;

	}

}
