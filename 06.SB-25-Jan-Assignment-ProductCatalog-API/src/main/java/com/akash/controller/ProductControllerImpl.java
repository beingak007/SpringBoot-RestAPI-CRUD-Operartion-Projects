package com.akash.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.model.Product;
import com.akash.service.ProductServiceImpl;

@RestController
public class ProductControllerImpl implements ProductController {

	@Autowired
	private ProductServiceImpl productServiceImpl;

	@Override
	@GetMapping("/showAllData")
	public List<Product> showAllData() {
		return productServiceImpl.showAllData();

	}

	@Override
	@PostMapping("/inserDataProduct")
	public Product insertData(@RequestBody Product pd) {
		return productServiceImpl.insertData(pd);

	}

	@Override
	@GetMapping("/getDataProoduct/{id}")
	public Product GetData(@PathVariable int id) {
		return productServiceImpl.GetData(id);

	}

	@Override
	@PutMapping("/updateDataProduct")
	public Product updateData(@RequestBody Product pd) {

		return productServiceImpl.updateData(pd);

	}

	@Override
	@DeleteMapping("/deleteProduct/{id}")
	public Product deleteData(@PathVariable int id) {
		return productServiceImpl.deleteData(id);

	}

}
