package com.learning.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int role_id;
	private String name;

	public Role() {
		super();
	}

	public Role(int role_id, String name) {
		super();
		this.role_id = role_id;
		this.name = name;
	}

	public Role(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", name=" + name + "]";
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
