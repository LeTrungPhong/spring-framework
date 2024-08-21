package com.laptrinhjavaweb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.laptrinhjavaweb.model.Account;

public interface AccountRepository extends JpaRepository<Account, String>{
	Optional<Account> findByAccount_ID(@Param("account_ID") String account_ID);
}
