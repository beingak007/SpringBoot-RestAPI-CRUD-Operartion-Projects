package com.akash.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product_Catalog_System")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Product_ID")
	private int id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Description")
	private String desc;

	@Column(name = "Category")
	private String category;

	static {
		System.err.println("Product class file is loading ...");
	}

	public Product() {
		super();
	}

	public Product(int id, String ame, String desc, String color) {
		super();
		this.id = id;
		this.name = ame;
		this.desc = desc;
		this.category = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAme() {
		return name;
	}

	public void setAme(String ame) {
		this.name = ame;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getColor() {
		return category;
	}

	public void setColor(String color) {
		this.category = color;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc + ", category=" + category + "]";
	}

}
