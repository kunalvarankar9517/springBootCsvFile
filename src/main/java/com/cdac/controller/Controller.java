package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.service.CustomerService;

@RestController 
public class Controller {
	
	@Autowired
	
	private CustomerService customerService;
	
	@RequestMapping(path="saveData")
	public void saveDatInDb() {
		
		customerService.saveCustomer();
	}
	

}
