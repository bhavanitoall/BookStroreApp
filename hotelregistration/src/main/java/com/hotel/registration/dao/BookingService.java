package com.hotel.registration.dao;

import java.util.List;
import java.util.function.IntPredicate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Service;

import com.hotel.registration.model.Book;

import com.hotel.registration.repository.BooksRepository;

@Service
@Transactional
public class BookingService {
	@Autowired
	BooksRepository booksRepository;
	


	public List<Book> listAll() {
        return booksRepository.findAll();
    }
     
    public void saveBook(Book book) {
        booksRepository.save(book);
    }
   
     
	
    public Book get(long id) {
        return booksRepository.findById(id).get();
    }
     
    public void delete(long id) {
        booksRepository.deleteById(id);
    }
	

	

	public void save(Book book) {
		// TODO Auto-generated method stub
		
	}

	public List<Book> getAllbooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addDetails(Book book) {
		// TODO Auto-generated method stub
		
	}

	public IntPredicate getAllbook() {
		// TODO Auto-generated method stub
		return null;
	}

	public int bookingCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
}
