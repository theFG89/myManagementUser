package com.userManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_token")
public class userToken {

	@Id
	private String idToken;
	
	@Column
	private String idU;
	
	@Column
	private String token;

	public userToken(String idToken, String idU, String token) {
		super();
		this.idToken = idToken;
		this.idU = idU;
		this.token = token;
	}

	public String getIdToken() {
		return idToken;
	}

	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	public String getIdU() {
		return idU;
	}

	public void setIdU(String idU) {
		this.idU = idU;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
}
