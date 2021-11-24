package com.hotel.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class RegisterBean {
	@Id
	
	private int cutomerId;
	
    
	private String firstName;
	
   
	private String lastName;
	
   
	private String contactNo;
	
	
	private String emailId;
	

	private String userName;
	

	private String password;

	public int getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}
	public String getFirstName() {
		return firstName;
	}
     
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public RegisterBean(int cutomerId, String firstName, String lastName, String contactNo, String emailId,
			String userName, String password) {
		super();
		this.cutomerId = cutomerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
	}

	public RegisterBean() {
		super();
	}

}
