package com.hotel.registration.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hotel.registration.model.Book;


public interface BooksRepository extends JpaRepository<Book,Long>  {

	Optional<Book> findById(long id);

	

	void deleteById(long id);

	
	
}
