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

import com.akash.model.Mobile;
import com.akash.service.MobileService;

@RestController
public class MobileControllerImpl implements MobileController  {

	@Autowired
	private MobileService mobileService;

	@Override
	@GetMapping("/showMultipleMobileRecords")
	public List<Mobile> ShowAllData() {

		return mobileService.ShowAllData();
	}

	@Override
	@PostMapping("/insertMobileRecBody")
	public Mobile inserDataRecBody(@RequestBody Mobile mob) {

		return mobileService.inserDataRecBody(mob);
	}

	@Override
	@GetMapping("/showSingleMobileRecAPI/{id}")
	public Mobile getDataAPI(@PathVariable int id) {

		return mobileService.getDataAPI(id);

	}

}
