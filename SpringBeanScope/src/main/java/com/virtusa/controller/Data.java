package com.virtusa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController("/test")
public class Data {
	


	@Autowired
	private Customer customer;
	
	@GetMapping("/nameRS")
	public String helloRS() {
		return customer.getDataRequestScope().getName();
	}
	
	@RequestMapping("/nameSSUpdated")
	public String helloSSUpdated() {
		customer.getDataSessionScope().setName("Session Scope Updated");
		return customer.getDataSessionScope().getName();
	}
	
	@RequestMapping("/nameSS")
	public String helloSS() {
		return customer.getDataSessionScope().getName();
	}
}
