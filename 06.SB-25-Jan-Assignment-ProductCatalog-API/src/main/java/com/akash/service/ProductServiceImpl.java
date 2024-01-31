package com.akash.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.dao.ProductDaoImpl;
import com.akash.model.Product;

@Service
public class ProductServiceImpl implements ProductService  {

	@Autowired
	private ProductDaoImpl productDaoImpl;

	@Override
	public List<Product> showAllData() {

		return productDaoImpl.showAllData();
	}

	@Override
	public Product insertData(@RequestBody Product pd) {

		return productDaoImpl.insertData(pd);

	}

	@Override
	public Product GetData(@PathVariable int id) {
		return productDaoImpl.GetData(id);

	}

	@Override
	public Product updateData(@RequestBody Product pd) {

		return productDaoImpl.updateData(pd);

	}

	@Override
	public Product deleteData(@PathVariable int id) {

		return productDaoImpl.deleteData(id);

	}

}
