package com.akash.zzz_19_Jan_MySecond_API;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentBasic {
	
	@RequestMapping("sabName")
	public ArrayList<String> getName() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mrunali");
		al.add("Akash");
		al.add("Abhi");
		al.add("Shailesh");
		al.add("Tanuja");
		
		
		return al;
		
		
	}
	
	@RequestMapping("idName")
	public HashMap<Integer, String> getName1() {
		HashMap<Integer, String> al = new HashMap<Integer, String>();
		al.put(1,"Mrunali");
		al.put(2,"Akash");
		al.put(3,"Abhi");
		al.put(4,"Shailesh");
		al.put(5,"Tanuja");
		
		
		return al;
		
		
	}
	

}
