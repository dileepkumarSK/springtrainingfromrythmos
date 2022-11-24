package com.paytm.services;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SHOPPING" )
public interface Shoopingfiegn {

	@GetMapping("/vegitables")
	public Integer vegitables();

	@GetMapping("/grociers")
	public Integer grociers();

	@GetMapping("/fruits")
	public Integer fruits();

	@GetMapping("/oils")
	public Integer oils();

	@GetMapping("/masala")
	public Integer masala();

}
