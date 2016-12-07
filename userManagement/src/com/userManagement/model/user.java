package com.userManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idU;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="name")
	private String name;

	@Column(name="surname")
	private String surname;
	
	@Column(name="telephone")
	private String telephone;
	
	public String getIdU() {
		return idU;
	}
	
	public user (String i, String n, String s, String u, String p, String t){
		this.idU=i;
		this.name=n;
		this.surname=s;
		this.username=u;
		this.password=p;
		this.telephone=t;
	}

	public void setIdU(String idU) {
		this.idU = idU;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
