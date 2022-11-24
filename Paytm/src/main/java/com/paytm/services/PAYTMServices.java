package com.paytm.services;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.paytm.entitys.CustmoerDetails;
import com.paytm.errors.NosufficentFund;

@Service
public class PAYTMServices {
	@Autowired
	RestTemplate rs;

	public Integer checkbalance() {

		System.err.println("PAYTMServices.checkbalance()");

//		Integer sbiBalance = rs.execute("http://SBIAPP/sbi/currentbalance",,HttpMethod.GET,null, Integer.class);
		// getForObject("http://SBIAPP/sbi/currentbalance", Integer.class);

		Integer sbiBalance = rs.getForObject("http://SBIAPP/sbi/currentbalance", Integer.class);

		WebClient web = WebClient.create();

		// Integer
		// sbiBalance=web.get().uri("http://localhost:1996/sbi/currentbalance").retrieve().bodyToMono(Integer.class).block();
//		Integer sbiBalance = rs.getForObject("http://localhost:1996/sbi/currentbalance", Integer.class);
		return sbiBalance;

	}

	public void debit(Integer amount) {
		System.err.println("PAYTMServices.debit()");
		if (amount > checkbalance()) {
			throw new NosufficentFund("no sufficeient fund");
		}

		String sbiBalance = rs.getForObject("http://SBIAPP/sbi/debit/{amount}", String.class, amount);

	}

	public String addmoneytoSBI(Integer amount) {
		RestTemplate rsw= new RestTemplate();
		//Integer balnce=rs.exchange("http://SBIAPP/sbi/credit/{amount}",HttpMethod.POST, new HttpEntity<Integer>(new HttpHeaders()),Integer.class,amount);
	//	String sbiBalance = rs.getForObject("http://SBIAPP/sbi/credit/{amount}", String.class, amount);
		HttpEntity<Integer> entity=new HttpEntity<Integer>(amount);
		String sbiBalance = rsw.postForObject("http://localhost:1996/sbi/credit/{amount}",entity ,String.class, amount);

		return sbiBalance;
	}

	public CustmoerDetails getdetalails() {
		CustmoerDetails det=rs.getForObject("http://SBIAPP/sbi/accountdetails", CustmoerDetails.class);
		return det;
	}

}
