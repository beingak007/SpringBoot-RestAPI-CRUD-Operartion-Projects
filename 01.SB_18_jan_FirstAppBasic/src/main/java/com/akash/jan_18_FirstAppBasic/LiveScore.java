package com.akash.jan_18_FirstAppBasic;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // to control the webservices
public class LiveScore{

	@RequestMapping("sachinLiveScore")
	public int sachinT() {

		return 123;

	}

	@RequestMapping("dhoniLiveScore")
	public int dhoniD() {

		return 129;

	}

	@RequestMapping("myName")
	public String mayName() {

		return "You Are The Unknow Person";
		
		

	}
	
	@RequestMapping("sabName")
	public ArrayList<String> subName() {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Akash");
		al.add("Shailesh");
		al.add("Tanuja");
		al.add("Nisha");
		return al;
		
		
	}
	@RequestMapping("kamName")
	public  HashMap<Integer, String> name() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Akash");
		hm.put(2, "Shivam");
		hm.put(3, "Shailesh");
		hm.put(4, "Raj");
		hm.put(5, "Sidharth");
		return hm;
		
		
	}

}
