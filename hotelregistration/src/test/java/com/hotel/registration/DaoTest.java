package com.hotel.registration;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


import com.hotel.registration.dao.BookingService;
import com.hotel.registration.model.Book;

import com.hotel.registration.repository.BooksRepository;


@SpringBootTest
class DaoTest 
{
	
	@Mock
	BooksRepository booksRepository;
	@InjectMocks
	BookingService bookingService;
	
	@Test
	@DisplayName("there book available to book")
	void testBooksRepository() 
	{
		List<Book> book = booksRepository.findAll();
		when(booksRepository.findAll()).thenReturn(book);
		 Assertions.assertThat(bookingService.getAllbook());
		 verify(booksRepository,times(2)).findAll();
	}

}
