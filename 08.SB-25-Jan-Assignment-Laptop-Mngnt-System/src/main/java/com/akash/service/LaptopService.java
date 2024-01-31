package com.akash.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Laptop;

public interface LaptopService {

	public Laptop insertSingleRecBody(@RequestBody Laptop laptop);

	public List<Laptop> ShowAllData();

	public Laptop SingleRecAPI(@PathVariable int id);

	public Laptop updateSingleBody(@RequestBody Laptop laptop);

	public List<Laptop> multipleUpdate(@RequestBody List<Laptop> list);

	public Laptop deleteSingleAPI(@PathVariable int id);

}
