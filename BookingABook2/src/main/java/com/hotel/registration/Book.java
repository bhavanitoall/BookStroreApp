package com.hotel.registration;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Book {
	  @Id
	  private Long Id;
	  private String name;
	  private String auther;
	  private Integer price;
	  Book(String string, String string2, String string3){
	    
	  }
	public Book(Long string, String name, String auther, Integer string2) {
		super();
		Id = string;
		this.name = name;
		this.auther = auther;
		this.price = string2;
	}
	public Book(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}