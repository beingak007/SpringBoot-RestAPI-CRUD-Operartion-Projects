package com.akash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.dao.MobileDao;
import com.akash.dao.MobileDaoImpl;
import com.akash.model.Mobile;

@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileDaoImpl daoImpl;
	

	@Override
	public List<Mobile> ShowAllData() {
		return daoImpl.ShowAllData();
	}

	@Override
	public Mobile inserDataRecBody(Mobile mob) {
		return daoImpl.inserDataRecBody(mob);
	}

	@Override
	public Mobile getDataAPI(int id) {
		return daoImpl.getDataAPI(id);
	}

}
