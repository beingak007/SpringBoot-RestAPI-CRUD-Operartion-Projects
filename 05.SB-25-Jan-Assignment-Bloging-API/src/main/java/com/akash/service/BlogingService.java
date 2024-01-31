package com.akash.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Bloging;

public interface BlogingService {

	List<Bloging> getAllData();

	Bloging insertSinglePost(Bloging bloging);

	Bloging showSingleData(int id);

	Bloging updateData(Bloging bloging);

	List<Bloging> updateMulData(List<Bloging> list);

	Bloging deleteSingleData(int id);

}