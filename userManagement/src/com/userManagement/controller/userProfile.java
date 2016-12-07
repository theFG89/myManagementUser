package com.userManagement.controller;

public enum userProfile {
    USER("USER"),
   // DBA("DBA"),
    ADMIN("ADMIN");
     
    String userProfileType;
     
    private userProfile(String userProfileType){
        this.userProfileType = userProfileType;
    }
     
    public String getUserProfileType(){
        return userProfileType;
    }
     
}