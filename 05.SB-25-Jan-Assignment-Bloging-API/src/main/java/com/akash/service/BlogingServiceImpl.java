package com.akash.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.dao.BlogingDaoImpl;
import com.akash.model.Bloging;

@Service
public class BlogingServiceImpl implements BlogingService {

	@Autowired
	private BlogingDaoImpl blogingDaoImpl;

	@Override
	public List<Bloging> getAllData() {

		return blogingDaoImpl.getAllData();

	}

	@Override
	public Bloging insertSinglePost(@RequestBody Bloging bloging) {
		return blogingDaoImpl.insertSinglePost(bloging);

	}

	@Override
	public Bloging showSingleData(@PathVariable int id) {

		return blogingDaoImpl.ShowSingleData(id);

	}

	@Override
	public Bloging updateData(@RequestBody Bloging bloging) {

		return blogingDaoImpl.updateSingleData(bloging);

	}

	@Override
	public List<Bloging> updateMulData(@RequestBody List<Bloging> list) {

		return blogingDaoImpl.updateMulData(list);

	}

	@Override
	public Bloging deleteSingleData(@PathVariable int id) {

		return blogingDaoImpl.deleteSingleData(id);
	}

}
