package com.userManagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.userManagement.model.user;




@Repository("userDao")
public class userDaoImpl implements userDao{

	@PersistenceContext
	private EntityManager em;


	@Override
	public void save(user u) {
		em.persist(u);
		
	}

	@Override
	public void delete(user u) {
		em.remove(u);
		
	}

	@Override
	public void edit(user u) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<user> getAllUser() {
		 List<user> u = em.createQuery("from user",user.class).getResultList();
		return u;
	}

	@Override
	public user findUser(int idU) {
		user userResult = em.find(user.class, idU);
		return userResult;
	}

}
