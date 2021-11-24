package com.hotel.registration.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hotel.registration.model.BookedRooms;
import com.hotel.registration.repository.RoomsRepository;

@Component
public class BookingDao {
	@Autowired
	RoomsRepository roomsRepository;
	@Autowired
	JdbcTemplate jdbc;


	public void saveBooking(BookedRooms bookedRooms) {

		roomsRepository.save(bookedRooms);
	}

	public List<BookedRooms> getAllrooms() {

		List<BookedRooms> rooms = roomsRepository.findAll();
		
		return rooms;
	}
	public long bookingCount() {

		long count =roomsRepository.count();
		return count;
	}
	
}
