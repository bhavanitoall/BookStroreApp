package com.hotel.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.registration.model.BookedRooms;

public interface RoomsRepository extends JpaRepository<BookedRooms,Integer>  {

	
}
