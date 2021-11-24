package com.hotel.registration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookController {
  @Autowired
  private BookService bookService;
  
  
  
  @GetMapping(value="/books/{Id}") 
  public List<Book>getBookById(@PathVariable Integer Id) { 
    System.out.println("Id------" + Id);
    List<Book>BookList = bookService.findBookById();
    return BookList; 
  }
}

