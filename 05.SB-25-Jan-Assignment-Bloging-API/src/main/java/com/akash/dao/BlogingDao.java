package com.akash.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Bloging;

public interface BlogingDao {

	List<Bloging> getAllData();

	Bloging insertSinglePost(Bloging bloging);

	Bloging ShowSingleData(int id);

	Bloging updateSingleData(Bloging bloging);

	List<Bloging> updateMulData(List<Bloging> list);

	Bloging deleteSingleData(int id);

}