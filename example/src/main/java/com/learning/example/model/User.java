package com.learning.example.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "User", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int user_id;

	private String email;
	private String first_name;
	private String last_name;
	private String password;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), 
		inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Collection<Role> roles;

	public User() {
		super();
	}

	public User(int user_id, String email, String first_name, String last_name, String password) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
	}

	public User(int user_id, String email, String first_name, String last_name, String password, Collection<Role> roles) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.roles = roles;
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", password=*********, roles=" + roles + "]";
	}

}
