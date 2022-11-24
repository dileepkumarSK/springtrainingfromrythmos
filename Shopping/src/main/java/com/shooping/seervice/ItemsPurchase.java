package com.shooping.seervice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service

public class ItemsPurchase {

	String vegitables;
	String fruits;
	String grociriers;
	String olis;
	String masalas;

	public Integer getVegitables() {
		return 23;
	}

	public Integer getFruits() {
		return 110;
	}

	public Integer getGrociriers() {
		return 550;
	}

	public Integer getOlis() {
		return 600;
	}

	public Integer getMasalas() {
		return 60;
	}

}
