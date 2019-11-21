package com.service;

import java.util.List;

import com.model.Admin;
import com.model.Bus;
import com.model.Route;




public interface AdminServiceIntf {

	public Admin validateAdmin(Admin admin);
	 
	
	
	public boolean addBus(Bus bus);


	public List<Bus> getBus();
	
	public boolean addRoute(Route route);

}
