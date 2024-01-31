package com.akash.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Food Management System")
public class Fms {
	
	@Id
	@Column(name="fid")
	private int id;
	
	@Column(name="fname") 
	private String name;

	public Fms() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fms(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FMS [id=" + id + ", name=" + name + "]";
	}
	

}
