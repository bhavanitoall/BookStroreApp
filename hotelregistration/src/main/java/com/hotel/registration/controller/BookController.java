//package com.hotel.registration.controller;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//
//import com.hotel.registration.dao.BookingService;
//import com.hotel.registration.dao.RegisterDao;
//import com.hotel.registration.model.Book;
//
//import com.hotel.registration.model.RegisterBean;
//import com.hotel.registration.repository.BookRepository;
//
//
//@Controller
//public class BookController {
//	
//	//controller => service => repository
//	
//	@Autowired
//	BookRepository bookRepository;
//	@Autowired
//	RegisterDao registerDao;
//	
//	@Autowired
//	BookingService bookingService;
//
//	
//	
////	@ModelAttribute
////	public void models(Model map,@ModelAttribute("userDetails") RegisterBean userDetails){
////		long cid= registerDao.customerCount()+1;
////		map.addAttribute("cid", cid);
////		
////		long bid = bookingService.bookingCount()+1;
////        map.addAttribute("bid",bid );
////        
////        
////	}
//	@GetMapping(value={"/home","/"})
//	public String showHomePage(String string) {
//		return "home";
//	}
//
//	@RequestMapping(value = "/user/home", method = RequestMethod.GET)
//	public String userWelcome(Model map) {
//
//		return "userhome";
//	}
//
//	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
//	public String adminHome(Model map) {
//
//		return "adminhome";
//	}
//
//	@RequestMapping(value = "/userlogin", method = RequestMethod.GET)
//	public String loginPage() {
//		return "userlogin";
//	}
//
//	@GetMapping("/signup")
//	public String doRegister(Model map) {
//		
//		map.addAttribute("userDetails", new RegisterBean());
//		return "signup";
//	}
//
//	@RequestMapping(value = "/register", method = RequestMethod.GET)
//	public String postForm(@ModelAttribute("userDetails") RegisterBean userDetails, ModelMap model,
//			BindingResult result) throws ClassNotFoundException, SQLException, IOException {
//		
//		registerDao.addDetails(userDetails);
//		
//		return "home";
//	}
//	 
//	@GetMapping("/book")
//	public String doBooking(Model map) {
//		
//		
//		map.addAttribute("index", new Book());
//		
//		return "index";
//	}
//	@PostMapping("/booksuccess")
//	public String bookingDone(Model map,@ModelAttribute("index") Book book) {
//		bookingService.saveBooking(book);
//		map.addAttribute("msg", " booked successfully ! ");
//		return "index";
//	}
//	@GetMapping("/index")
//	public String cheakBookings(@ModelAttribute("index") Book book,Model map) {
//	
//		List <Book> books = bookingService.getAllbooks();
//		
//		map.addAttribute("books", books);
//		
//		return "index";
//	}
//	
//	
//
//	
//}
