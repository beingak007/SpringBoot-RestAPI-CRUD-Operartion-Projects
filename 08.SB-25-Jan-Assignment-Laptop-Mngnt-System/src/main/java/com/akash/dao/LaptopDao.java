package com.akash.dao;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akash.model.Laptop;

public interface LaptopDao {

	//	@PostMapping("insertSingleRecordBody") //here problem occurs here 
	Laptop insertSingleRecBody(Laptop laptop);

	List<Laptop> ShowAllData();

	Laptop SingleRecAPI(int id);

	Laptop updateSingleBody(Laptop laptop);

	List<Laptop> multipleUpdate(List<Laptop> list);

	Laptop deleteSingleAPI(int id);

}