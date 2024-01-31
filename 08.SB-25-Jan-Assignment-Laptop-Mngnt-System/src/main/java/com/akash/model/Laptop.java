package com.akash.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptop_Management_System")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int id;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "HighDefination")
	private String hd;

	@Column(name = "Colour")
	private String color;

	@Column(name = "Price")
	private long price;

	@Column(name = "RAM")
	private String ram;

	@Column(name = "OS")
	private String os;

	static {
		System.err.println("Laptop class is loading ...");
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int id, String firstName, String hd, String color, long price, String ram, String os) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.hd = hd;
		this.color = color;
		this.price = price;
		this.ram = ram;
		this.os = os;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHd() {
		return hd;
	}

	public void setHd(String hd) {
		this.hd = hd;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", firstName=" + firstName + ", hd=" + hd + ", color=" + color + ", price=" + price
				+ ", ram=" + ram + ", os=" + os + "]";
	}
	

	
}
