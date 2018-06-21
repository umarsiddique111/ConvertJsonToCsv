package com.jsontocsv.controller;

import com.jsontocsv.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestApi {

	@RequestMapping(value="/AddUser" , method = RequestMethod.POST  )
	public User addUser(@RequestBody User user){
		
		
		return  user;
	}

	

}
