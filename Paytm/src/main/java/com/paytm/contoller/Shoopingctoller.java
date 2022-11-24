package com.paytm.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paytm.services.PAYTMServices;
import com.paytm.services.Shoopingfiegn;

@RestController
@RequestMapping("/purchase")
public class Shoopingctoller {
	@Autowired
	Shoopingfiegn shopingservices;
	@Autowired
	PAYTMServices paytmServices;

	@GetMapping("/vegitables" )
	public String veg() {
		System.err.println("Shoopingctoller.veg()");

		int total = shopingservices.vegitables();
		System.err.println(total);

		paytmServices.debit(total);
		return "success transaction" + total;
	}

	@GetMapping("/grociers")
	public String grociers() {
		System.err.println("Shoopingctoller.grociers()");

		int total = shopingservices.grociers();
		System.err.println(total);

		paytmServices.debit(total);
		return "success transaction" + total;
	}

	@GetMapping("/fruits")
	public String fruits() {
		System.err.println("Shoopingctoller.fruits()");

		int total = shopingservices.fruits();
		System.err.println(total);

		paytmServices.debit(total);
		return "success transaction" + total;
	}

	@GetMapping("/masala")
	public String masala() {
		System.err.println("Shoopingctoller.masala()");

		int total = shopingservices.masala();
		System.err.println(total);

		paytmServices.debit(total);
		return "success transaction" + total;
	}

	@GetMapping("/oils")
	public String oils() {
		System.err.println("Shoopingctoller.oils()");

		int total = shopingservices.oils();
		System.err.println(total);

		paytmServices.debit(total);
		return "success transaction" + total;
	}

}
