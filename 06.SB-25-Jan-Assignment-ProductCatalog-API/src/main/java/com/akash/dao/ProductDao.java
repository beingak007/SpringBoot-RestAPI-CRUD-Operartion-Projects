package com.akash.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Product;

public interface ProductDao {

	List<Product> showAllData();

	Product insertData(Product pd);

	Product GetData(int id);

	Product updateData(Product pd);

	Product deleteData(int id);

}