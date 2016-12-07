package com.userManagement.dao;

import java.util.List;
import com.userManagement.model.user;

public interface userDao {

	user findUser(int idU);
	void save(user u);
	void delete(user u);
	void edit(user u); //   FORSE NON SERVE
	List<user> getAllUser();
	
}
