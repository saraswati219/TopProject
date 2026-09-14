package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Account;


public interface BankServiceI {
	public Account addAccount(Account ac);

	public List<Account> getAccount();

	public Account deposit(String accNo,double amount);

	public Account withdraw(String accNo,double amount);
	public List<Account> delete(String accNo);

	public Account getAccount(String accNo);

	
	
	

	
	
	

}
