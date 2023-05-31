package com.tran;

import java.sql.SQLException;

public class ClientTest {

	public static void main(String[] args) {

		BankService bankService = new BankServiceImpl();

		Double transferAmout = 10000.00;
		Account fromAccount = new Account();
		fromAccount.setAccountNumber(9876835861L);

		Account toAccount = new Account();
		toAccount.setAccountNumber(9876598791L);

		try {
			bankService.fundTransfer(fromAccount, toAccount, transferAmout);
		} catch (SQLException | AccountNotFoundException | InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}