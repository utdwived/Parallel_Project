package com.cg.bta.service;

import java.math.BigInteger;
import java.util.List;

import com.cg.bta.dto.Credentials;
import com.cg.bta.dto.Customer;
import com.cg.bta.dto.Transactions;
import com.cg.bta.exception.TransactionException;

public interface BankService {
	public Customer signIn(String cstId, String cstPass);

	public void deposit(BigInteger depositAmount, Customer customer);

	public void withdraw(BigInteger withdrawAmount, Customer customer);

	public void transfer(BigInteger transferAmount, Customer customer,
			String reciever);

	public boolean validateWithdraw(String withdrawAmount, Customer customer)
			throws TransactionException;

	public boolean validateEnteredAmount(String withdrawAmount)
			throws TransactionException;

	public boolean validateNumber(String choose) throws TransactionException;

	public boolean validateName(String name) throws TransactionException;

	public String createAccount(String password, String custName,
			String accType, String date);

	public List<Transactions> fetchAllTransaction(Customer customer);

}
