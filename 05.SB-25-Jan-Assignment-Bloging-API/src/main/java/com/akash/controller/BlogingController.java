package com.akash.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Bloging;

public interface BlogingController {

	List<Bloging> getAllData();

	Bloging insertSinglePost(Bloging bloging);

	Bloging showSingle(int id);

	Bloging updateData(Bloging bloging);

	List<Bloging> updateData(List<Bloging> list);

	Bloging deleteData(int id);

}