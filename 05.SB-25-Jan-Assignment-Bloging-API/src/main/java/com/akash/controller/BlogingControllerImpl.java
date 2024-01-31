package com.akash.controller;

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

import com.akash.model.Bloging;
import com.akash.service.BlogingService;

@RestController
public class BlogingControllerImpl implements BlogingController  {

	@Autowired
	private BlogingService blogingServiceImpl;

	@Override
	@GetMapping("/getAllData")
	public List<Bloging> getAllData() {

		return blogingServiceImpl.getAllData();

	}

	@Override
	@PostMapping("/postsingledata")
	public Bloging insertSinglePost(@RequestBody Bloging bloging) {
		return blogingServiceImpl.insertSinglePost(bloging);

	}

	@Override
	@GetMapping("getSingleData/{id}")
	public Bloging showSingle(@PathVariable int id) {

		return blogingServiceImpl.showSingleData(id);

	}

	@Override
	@PutMapping("/updatesingleData")
	public Bloging updateData(@RequestBody Bloging bloging) {
		return blogingServiceImpl.updateData(bloging);

	}

	@Override
	@PutMapping("/updateMultipleData")
	public List<Bloging> updateData(@RequestBody List<Bloging> list) {

		return blogingServiceImpl.updateMulData(list);

	}

	@Override
	@DeleteMapping("deleteSingledata/{id}")
	public Bloging deleteData(@PathVariable int id) {
		

		return blogingServiceImpl.deleteSingleData(id);
	}

}
