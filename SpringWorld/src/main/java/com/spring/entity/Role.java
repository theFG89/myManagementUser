package com.spring.entity;

public class Role {
	
	private String idU;
	private String roleUser;
	public Role(String idU, String roleUser) {
		
		this.idU = idU;
		this.roleUser = roleUser;
	}
	public String getIdU() {
		return idU;
	}
	public void setIdU(String idU) {
		this.idU = idU;
	}
	public String getRoleUser() {
		return roleUser;
	}
	public void setRoleUser(String roleUser) {
		this.roleUser = roleUser;
	}
	
	

}
