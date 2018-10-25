package com.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//This line has been added to push changes to git repository


@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	int id;
	String name;
	String dateOfJoin;
	String city;
	String contactNum;
	
	public Customer(int id, String name, String dateOfJoin, String city, String contactNum) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoin = dateOfJoin;
		this.city = city;
		this.contactNum = contactNum;
	}

	public Customer() {
		super();
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

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	
	

}
