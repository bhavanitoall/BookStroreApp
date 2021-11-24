package com.hotel.registration.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.registration.dao.BookingDao;
import com.hotel.registration.dao.BookingService;
import com.hotel.registration.dao.RegisterDao;
import com.hotel.registration.model.Book;
import com.hotel.registration.model.BookedRooms;
import com.hotel.registration.model.RegisterBean;
import com.hotel.registration.repository.UserRepository;

@Controller
public class HomeController {
	
	//controller => service => repository
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	RegisterDao registerDao;
	
	@Autowired
	BookingService bookingService;
	@Autowired
	BookingDao bookingDao;

	org.slf4j.Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@ModelAttribute
	public void models(Model map,@ModelAttribute("userDetails") RegisterBean userDetails){
		long cid= registerDao.customerCount()+1;
		map.addAttribute("cid", cid);
		
		long bid = bookingDao.bookingCount()+1;
        map.addAttribute("bid",bid );
        
        
       
        
        
	}
	@GetMapping(value={"/home","/"})
	public String showHomePage(String string) {
		return "home";
	}

	@RequestMapping(value = "/user/home", method = RequestMethod.GET)
	public String userWelcome(Model map) {

		return "userhome";
	}

	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
	public String adminHome(Model map) {

		return "adminhome";
	}

	@RequestMapping(value = "/userlogin", method = RequestMethod.GET)
	public String loginPage() {
		return "userlogin";
	}
	
	@RequestMapping(value = "/searchbookform", method = RequestMethod.GET)
	public String bookingSearchPage() {
		return "searchbookform";
	}
	@RequestMapping(value = "/searchbook", method = RequestMethod.GET)
	public String bookingSearchListPage() {
		return "searchbook";
	}
	@RequestMapping(value = "/edit_book", method = RequestMethod.GET)
	public String editBookPage() {
		return "edit_book";
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String formPage() {
		return "index";
	}
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Book> book = bookingService.getAllbooks();
	    model.addAttribute("book", book);
	     
	    return "index";
	}
		
	@RequestMapping("/new")
	public String showNewBookPage(Model model) {
	    Book book = new Book();
	    model.addAttribute("book", book);
	     
	    return "new_book";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBooking(@ModelAttribute("book") Book book) {
	    bookingService.save(book);
	     
	    return "home";
	}

	
	
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditBookPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("edit_book");
	    Book book = bookingService.get(id);
	    mav.addObject("book", book);
	     
	    return mav;
	    
	}
	@RequestMapping("/delete/{id}")
	public String deleteBook(@PathVariable(name = "id") int id) {
	    bookingService.delete(id);
	    return "redirect:/";       
	}
	@GetMapping("/signup")
	public String doRegister(Model map) {
		
		map.addAttribute("userDetails", new RegisterBean());
		return "signup";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String postForm(@ModelAttribute("userDetails") RegisterBean userDetails, ModelMap model,
			BindingResult result) throws ClassNotFoundException, SQLException, IOException {
		
		registerDao.addDetails(userDetails);
		
		return "home";
	}
	 
	@GetMapping("/bookroom")
	public String doBooking(Model map) {
		
		
		map.addAttribute("bookingDetails", new BookedRooms());
		
		return "booking";
	}
	@PostMapping("/bookroomsuccess")
	public String bookingDone(Model map,@ModelAttribute("bookingDetails") BookedRooms bookedRooms) {
		bookingDao.saveBooking(bookedRooms);
		map.addAttribute("msg", "Room booked successfully ! ");
		return "booking";
	}
	@GetMapping("/bookedrooms")
	public String cheakBookings(@ModelAttribute("bookingDetails") BookedRooms bookedRooms,Model map) {
	
		List <BookedRooms> rooms = bookingDao.getAllrooms();
		
		map.addAttribute("rooms", rooms);
		
		return "bookingdetails";
	}
	
	

	
}
