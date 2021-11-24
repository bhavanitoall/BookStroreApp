package com.hotel.registration.model;

 


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	
	private Long id; 
	
	private String name;
	
	private String auther;
	
	private Integer price;
	public Book(Long id, String auther, String name, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", auther=" + auther + ", price=" + price + "]";
	}
	public void addAttribute(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	
}