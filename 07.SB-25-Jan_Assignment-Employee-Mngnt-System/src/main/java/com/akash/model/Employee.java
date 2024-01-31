package com.akash.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Mngnt")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String LastName;
	
	@Column(name="DOB")
	private String DOB;
	
	@Column(name="Department")
	private String department;
	
	@Column(name="Position")
	private String position;
	
	@Column(name="Salary")
	private long salary;
	
	static {
		System.err.println("Employee class File Firing Here.....");
	}

	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName, String dOB, String department, String position,
			long salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.LastName = lastName;
		this.DOB = dOB;
		this.department = department;
		this.position = position;
		this.salary = salary;
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

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", DOB=" + DOB
				+ ", department=" + department + ", position=" + position + ", salary=" + salary + "]";
	}
	
	

}
