package com.hotel.registration.repository;




import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hotel.registration.model.RegisterBean;



public interface UserRepository extends JpaRepository<RegisterBean,Integer>  {
	 
}
