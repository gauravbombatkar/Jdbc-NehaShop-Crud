package com.tran;
import java.sql.Connection;
import java.sql.SQLException;

public interface BankDAO {
	public void withdraw(Connection connection,Account fromAccount,Account toAccount,Double amount) throws SQLException, AccountNotFoundException, InsufficientBalanceException;
	public void deposit(Connection connection,Account fromAccount,Account toAccount,Double amount)throws SQLException, AccountNotFoundException;
}