package com.sbi.repositeries;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sbi.entity.PassBook;

public interface PassBookRepo extends JpaRepository<PassBook, LocalDate> {

	@Query(value = "select *from pass_book getLastRecord ORDER BY srno DESC LIMIT 1",nativeQuery = true)
	PassBook findCurrentBalnce();
}
