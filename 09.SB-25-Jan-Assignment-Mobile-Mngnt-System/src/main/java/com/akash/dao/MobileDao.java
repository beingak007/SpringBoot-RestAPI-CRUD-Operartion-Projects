package com.akash.dao;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.akash.model.Mobile;

public interface MobileDao {

	List<Mobile> ShowAllData();

	Mobile inserDataRecBody(Mobile mob);

	Mobile getDataAPI(int id);

}