package com.akash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.dao.LaptopDaoImpl;
import com.akash.model.Laptop;

@Service
public class LaptopServiceImpl implements LaptopService {

	
	@Autowired
	private LaptopDaoImpl laptopDaoImpl;
	@Override
	public Laptop insertSingleRecBody(Laptop laptop) {
		return laptopDaoImpl.insertSingleRecBody(laptop);
	}

	@Override
	public List<Laptop> ShowAllData() {
		return laptopDaoImpl.ShowAllData();
	}

	@Override
	public Laptop SingleRecAPI(int id) {
		
		return laptopDaoImpl.deleteSingleAPI(id);
	}

	@Override
	public Laptop updateSingleBody(Laptop laptop) {
		return null;
	}

	@Override
	public List<Laptop> multipleUpdate(List<Laptop> list) {
		return laptopDaoImpl.multipleUpdate(list);
		
	}

	@Override
	public Laptop deleteSingleAPI(int id) {
		return laptopDaoImpl.deleteSingleAPI(id);
	}

	

}
