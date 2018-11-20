package com.cg.bta.dao;

import java.math.BigInteger;
import java.util.List;

import com.cg.bta.dto.Credentials;
import com.cg.bta.dto.Customer;
import com.cg.bta.dto.Transactions;

public interface BankDao {

	public Customer signIn(String cstId, String cstPass);

	public void deposit(BigInteger depositAmount, Customer customer);

	public void withdraw(BigInteger withdrawAmount, Customer customer);

	public Customer transfer(BigInteger transferAmount, Customer customer, String reciever);

	public void createAccount(Credentials credentials,Customer customer);

	public List<Transactions> fetchAllTransaction(Customer customer);

}
