package com.paytm.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.paytm.entitys.CustmoerDetails;
import com.paytm.services.PAYTMServices;

@RestController
@RequestMapping("/paytm")
public class PAYTMController {
	@Autowired
	PAYTMServices services;

	@GetMapping("/sbiBalanace")
	public Integer balance() {
		return services.checkbalance();

	}
	
	@GetMapping
	public String home()
	{
		return "Wel-Come to PAyT M";
	}
	
	
	
	@PostMapping("/addmoney/{amount}")
	public String addmoneytoBank(@PathVariable Integer amount)
	{
		return services.addmoneytoSBI(amount);
		
	}
	
	
	@GetMapping("/customerdeatils")
	public CustmoerDetails det()
	{
		return services.getdetalails();
	}
	
	
	
	
	
}
