package com.akash.service;

import java.util.List;

import com.akash.model.Mobile;

public interface MobileService {
	
	public List<Mobile> ShowAllData();
	
	public Mobile inserDataRecBody(Mobile mob) ;
	
	public Mobile getDataAPI(int id);

}
