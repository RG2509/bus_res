package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDaoIntf;
import com.model.Bus;

import com.model.Users;

@Service("userservice")
public class UserServImpl implements UserServIntf {
@Autowired
public UserDaoIntf userdao;
	

	@Transactional
	public boolean registerPassenger(Users user) {
		 
		return userdao.registerPassenger(user);	
	}

	
	@Transactional
	public List<Bus> getBuses(){
		List<Bus>  list = userdao.getBuses();
		  return list;
}
	
	

	@Transactional
	public Users validateUser(Users user) {
	
		  return userdao.validateUser(user);
	}
}
	