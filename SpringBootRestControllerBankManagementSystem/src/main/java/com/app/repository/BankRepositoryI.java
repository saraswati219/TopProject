package com.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Account;

public interface BankRepositoryI extends CrudRepository<Account,String> {

}
