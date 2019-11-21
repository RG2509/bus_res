package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.model.Bus;

import com.model.Users;
@Repository("userdao")


public class UserDaoImpl implements UserDaoIntf {
	@PersistenceContext
	EntityManager em;

public boolean registerPassenger(Users user) {
	boolean result=false;
	try{
	em.persist(user);
	result=true;
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	return result;
	
}

public List<Bus> getBuses(){
	  /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	  EntityManager em = emf.createEntityManager();*/	  
	  @SuppressWarnings("unchecked")
		List<Bus> buses = em.createQuery("SELECT b FROM  Bus b  ").getResultList();
	  em.close();
	  return  buses;
	  }



public Users validateUser(Users user) {
	  /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();*/
		Users f =null;
		try{
			f=(Users)em.createQuery("SELECT f FROM Users f WHERE f.Email=:email and f.Password=:pwd")
		         .setParameter("email", user.getEmail())
		         .setParameter("pwd",user.getPassword())
		         .getSingleResult();
		}
		catch(Exception e) {System.out.println(e); }
		em.close();
		System.out.println(f);
		return f;

}

}

	

