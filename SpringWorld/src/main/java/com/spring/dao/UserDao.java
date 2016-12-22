package com.spring.dao;

import java.util.List;

import com.spring.entity.User;

public interface UserDao {

	User findUserById(String id);
	void saveUser(User user);
	void deleteUser(User user);
	List<User> findAllUsers();
}
