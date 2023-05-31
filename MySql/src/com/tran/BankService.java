package com.tran;
import java.sql.SQLException;


public interface BankService {
	public void fundTransfer(Account fromAccount,Account toAccount,Double amount) throws SQLException, AccountNotFoundException, InsufficientBalanceException;
}