package com.hotel.registration.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookedRooms {

	@Id
	private int bookingId;
	
	private String roomType;
	private int noOfPersons;
	private String fromDate;
	private String toDate;

	
	
	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public BookedRooms() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public BookedRooms(int bookingId,  String roomType, int noOfPersons,
			String fromDate, String toDate) {
		super();
		this.bookingId = bookingId;
	
		this.roomType = roomType;
		this.noOfPersons = noOfPersons;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Object getAllRooms() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BookedRooms> getfindAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BookedRooms> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
