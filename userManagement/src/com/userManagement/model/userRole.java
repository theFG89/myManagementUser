package com.userManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_role")
public class userRole {
	@Id
	private String idU;
	
	@Column
	private String role;

	

	public userRole(String i, String r){
		this.idU=i;
		this.role=r;
	}



	public String getIdU() {
		return idU;
	}



	public void setIdU(String idU) {
		this.idU = idU;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}
	
	
}
