package com.dao;

import java.util.List;

import com.model.Admin;
import com.model.Bus;
import com.model.Route;


public interface AdminDaoIntf {

	Admin validateAdmin(Admin admin);
	
	boolean addBus(Bus bus);

	List<Bus> getBus();
	boolean addRoute(Route route);
}
