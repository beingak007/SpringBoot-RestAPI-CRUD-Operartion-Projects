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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.model.Laptop;
import com.akash.service.LaptopServiceImpl;

@RestController
public class LaptoppController implements LaptopController {

	@Autowired
	private LaptopServiceImpl laptopServiceImpl;

//
	@Override
	@RequestMapping("/insertSingleLaptopRecordBody")
	public Laptop insertSingleRecBody(@RequestBody Laptop laptop) {

		return laptopServiceImpl.insertSingleRecBody(laptop);
	}

	@Override
	@GetMapping("/ShowAllLaptopRecords")
	public List<Laptop> ShowAllData() {

		return laptopServiceImpl.ShowAllData();
	}

	@Override
	@GetMapping("/showSingleLaptopRecord/{id}")
	public Laptop SingleRecAPI(@PathVariable int id) {

		return laptopServiceImpl.SingleRecAPI(id);
	}

	@Override
	@RequestMapping("/updateSingleLaptopRecordBody")
	public Laptop updateSingleBody(@RequestBody Laptop laptop) {

		return laptop;
	}

	@Override
	@PutMapping("/updateMultipleMobileRecord")
	public List<Laptop> multipleUpdate(@RequestBody List<Laptop> list) {

		return laptopServiceImpl.multipleUpdate(list);
	}

	@Override
	@DeleteMapping("/deleteSingleMobileRecAPI/{id}")
	public Laptop deleteSingleAPI(int id) {

		return laptopServiceImpl.deleteSingleAPI(id);

	}

}
