package com.sbi.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassBook {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer srno;
	@CreationTimestamp
	LocalDate txDate;
	Integer balance;
	Integer debit;
	Integer credit;
	
}
