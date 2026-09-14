package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Account;
import com.app.repository.BankRepositoryI;

@Service
public class BankService implements BankServiceI {
	@Autowired
	private BankRepositoryI br;

	@Override
	public Account addAccount(Account ac) {
		
		return br.save(ac);
	}

	@Override
	public List<Account> getAccount() {
		
		return (List<Account>)br.findAll();
	}

	@Override
	public Account deposit(String accNo, double amount) {
		Optional<Account> op = br.findById(accNo);
		if(op.isPresent()) {
			Account ac=op.get();
			double newBalance = ac.getBalance()+amount;
			ac.setBalance(newBalance);
			return br.save(ac);
		}else {
			throw new RuntimeException("Account not Found");
		
		}
	}

	@Override
	public Account withdraw(String accNo, double amount) {
		Optional<Account> op=br.findById(accNo);
		if(op.isPresent()) {
			Account ac=op.get();
			if(amount<=ac.getBalance()) {
				double newBalance = ac.getBalance()-amount;
				ac.setBalance(newBalance);
			
		
		
		return br.save(ac);
	}else {
		throw new InsufficientBalanceException("Insufficient Balance");
	}
}else {
	throw new RuntimeException("Account not found");
}
	}

	@Override
	public List<Account> delete(String accNo) {
		
	br.deleteById(accNo);
		
		return (List<Account>)br.findAll();
	}

	@Override
	public Account getAccount(String accNo) {
		
	Optional<Account> op = br.findById(accNo);
	if(op.isPresent()) {
		
		return op.get();
	}

	return null;
}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

