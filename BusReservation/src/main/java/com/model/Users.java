package com.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	
	
//@GeneratedValue(strategy=GenerationType.AUTO)
	
    @Id
	private String Email;
	private String Fullname;
	private String Mobile;
	private String Password;
	

	public Users() {
		super();
	}


	
  public String getFullname() {
		return Fullname;
	}


   public void setFullname(String fullname) {
		Fullname = fullname;
	}

  public String getMobile() {
		return Mobile;
	}

   public void setMobile(String mobile) {
		Mobile = mobile;
	}

  public String getEmail() {
		return Email;
	}


public void setEmail(String email) {
		Email = email;
	}


public String getPassword() {
		return Password;
	}


public void setPassword(String password) {
		Password = password;
	}





	
	
	
	
	
	
	
}
