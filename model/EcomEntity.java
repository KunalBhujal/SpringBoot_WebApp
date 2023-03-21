package com.ecommerce.app.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class EcomEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String email;
	private String first_name;
	private String last_name;
	private String type;

	//private String password;
	
	
	public EcomEntity() {
		super();
		
	}


	public EcomEntity(String email, String first_name, String last_name, String type, String id) {
		super();
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.type = type;
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstname() {
		return first_name;
	}


	public void setFirstname(String first_name) {
		this.first_name = first_name;
	}


	public String getLastname() {
		return last_name;
	}


	public void setLastname(String last_name) {
		this.last_name = last_name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	
}
