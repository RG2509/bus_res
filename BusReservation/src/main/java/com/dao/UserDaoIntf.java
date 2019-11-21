package com.dao;

import java.util.List;

import com.model.Bus;

import com.model.Users;

public interface UserDaoIntf {
	 boolean registerPassenger(Users user);
	 
	 public List<Bus> getBuses();
	 
	



	Users validateUser(Users user);
}
