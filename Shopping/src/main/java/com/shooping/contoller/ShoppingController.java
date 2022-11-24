package com.shooping.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shooping.seervice.ItemsPurchase;

@RestController
public class ShoppingController {
	@Autowired
	ItemsPurchase service;

	@GetMapping
	public String home() {
		return "wel-com to shooping";
	}

	@GetMapping("/vegitables")
	public Integer vegitables()
	{
		return service.getVegitables();
	}
	
	
	@GetMapping("/grociers")
	public Integer grociers()
	{
		return service.getGrociriers();
	}
	
	@GetMapping("/fruits")
	public Integer fruits()
	{
		return service.getFruits();
	}
	
	
	@GetMapping("/oils")
	public Integer oils()
	{
		return service.getOlis();
	}
	
	
	@GetMapping("/masala")
	public Integer masala()
	{
		return service.getMasalas();
	}

}
