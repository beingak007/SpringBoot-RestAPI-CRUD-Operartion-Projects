package com.akash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Product;

public interface ProductController {

	List<Product> showAllData();

	Product insertData(Product pd);

	Product GetData(int id);

	Product updateData(Product pd);

	Product deleteData(int id);

}