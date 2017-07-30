package com.shrobon.spring.springmvcorm.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//This class is the model
//We need to use JPA annotations to make this an entity so that hibernate can perform mapping 

@Entity
@Table(name="user")
public class User {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Id
	private int id; // Since this is a primary key, we use the @Id 
	
	private String name;
	
	private String email;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
