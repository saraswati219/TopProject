package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Account;
import com.app.service.BankServiceI;

@RestController
public class BankController {
	@Autowired
	private BankServiceI bs;
	
	@PostMapping("/account")
	public Account create(@RequestBody Account ac) {
		Account a = bs.addAccount(ac);
		return a;
	}
	
	@GetMapping("/get")
	public List<Account> getall(){
		List<Account> all = bs.getAccount();
		return all;
	}
	
	@PutMapping("/deposite/{accno}/{amount}")
	public Account depositeMoney(@PathVariable("accNo")String accNo,@PathVariable("amount")double amount) {
		Account a = bs.deposit(accNo,amount);
		
		
		return a;
		
	}
	@PutMapping("/withdraw/{accNo}/{amount}")
	public Account withdrawoney(@PathVariable("accNo")String accNo,@PathVariable("amount")double amount) {
		Account a = bs.withdraw(accNo,amount);
		
		
		return a;
		
	}
	@GetMapping("/delete/{accNo}")
	public List<Account> deleteAccount(@PathVariable("accNo")String accNo){
		List<Account> a = bs.delete(accNo);
		return a;
	}
	@GetMapping("/get/{accNo}")
	public Account getAccount(@PathVariable("accNo")String accNo) {
		Account a=bs.getAccount(accNo);
		return a;
	}

}
