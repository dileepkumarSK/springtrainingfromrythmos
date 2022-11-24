package com.sbi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.entity.PassBook;
import com.sbi.pojo.CustmoerDetails;
import com.sbi.services.SBiServices;


import lombok.Getter;

@RestController
@RequestMapping("/sbi")
public class Controller {

	@Autowired
	SBiServices service;
	@Autowired
	CustmoerDetails custmoerDetails;

	@GetMapping
	public String welcome() {
		return "Welcome to SBI";
	}

	@GetMapping("/accountdetails")
	public CustmoerDetails dat() {
		custmoerDetails.setBalance(service.currentbalance());
		custmoerDetails.setName("Dileep");
		custmoerDetails.setBank("SBI");
		return custmoerDetails;
	}

	@GetMapping("/transactions")
	public List<PassBook> transactions()
	{
		return service.tansaction();
	}
	@PostMapping("/credit/{amount}")
	public String addBalance(@PathVariable Integer amount) {

		return "Credited Successfully current balance " + service.addBalance(amount);
	}

	@GetMapping("/debit/{amount}")
	public String debit(@PathVariable Integer amount) {
		return "debited Successfully current balance " + service.debit(amount);
	}

	@GetMapping("/currentbalance")
	public Integer debit() {
		return service.currentbalance();
	}
}
