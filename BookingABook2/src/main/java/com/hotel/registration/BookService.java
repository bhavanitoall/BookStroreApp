package com.hotel.registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class BookService {
  public List<Book> findBookById(Integer Id){
    List<Book> bookList = getBookList();
    List<Book> BookList = new ArrayList<>();
    for(Book book :  bookList) {
      if(book.getId().equals(Id))
       BookList.add(book);
    }
    return BookList;
  }
    
  private List<Book> getBookList() {
	// TODO Auto-generated method stub
	return null;
}

private List<Book> getBookList1(){
    List<Book> bookList = new ArrayList<>();
    bookList.add(new Book("1", "Environmental Science", "Joseph", "998"));
    bookList.add(new Book("2", "Geography", "Stephe", "996"));
    bookList.add(new Book("3", "Political Science", "Gora", "980"));
    return bookList;
  }

public List<Book> findBookById() {
	// TODO Auto-generated method stub
	return null;
}
}
