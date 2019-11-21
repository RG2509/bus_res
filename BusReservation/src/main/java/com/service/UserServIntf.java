package com.service;

import java.util.List;

import com.model.Bus;

import com.model.Users;

public interface UserServIntf {

	public boolean registerPassenger(Users user);
	
	 public List<Bus> getBuses();
	 
	

	public Users validateUser(Users user);
}
