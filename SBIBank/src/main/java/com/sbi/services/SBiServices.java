package com.sbi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.entity.PassBook;
import com.sbi.errors.NosufficentFund;
import com.sbi.repositeries.PassBookRepo;



@Service
public class SBiServices {

	@Autowired
	PassBookRepo repo;

	public Integer addBalance(Integer amount) {
		PassBook book = new PassBook();
		book.setCredit(amount);
		if (repo.findCurrentBalnce() == null) {
			book.setBalance(amount);

		}

		else {

			book.setBalance(repo.findCurrentBalnce().getBalance() + amount);
		}
		repo.save(book);
		return repo.findCurrentBalnce().getBalance();
	}

	public Integer debit(Integer amount) {

		PassBook book = new PassBook();
		book.setDebit(amount);
		if (repo.findCurrentBalnce().getBalance() < amount)
		{
			 throw new NosufficentFund("insufficent FUnds "+repo.findCurrentBalnce().getBalance()) ;
		}
			
		else
			book.setBalance(repo.findCurrentBalnce().getBalance() - amount);

		repo.save(book);
		return repo.findCurrentBalnce().getBalance();
	}
	
	public Integer currentbalance() {
		
		return repo.findCurrentBalnce().getBalance();
	}

	public List<PassBook> tansaction() {
		
		return repo.findAll();
	}
	
	

}
