package com.shop.neha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShopMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcom To Neha H&E");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 to Add Client Information");
			System.out.println("Press 2 to Delete Client Information");
			System.out.println("Press 3 to Display Client Information");
			System.out.println("Press 4 to Exit Client Information");
			int c = Integer.parseInt(br.readLine());
		
		if(c==1)
		{
		System.out.println("Enter Name of a Client");	
		String name = br.readLine();
		
		System.out.println("Enter Phone Number of Client");
		String number = br.readLine();
		
		System.out.println("Enter TotalBill of a Client");
		String totalBill = br.readLine();
		
		Neha n = new Neha(name,number,totalBill);
		System.out.println(n);
		boolean ans = NehaDao.insertNehaToDb(n);
		if (ans) {
			System.out.println("Client is Added Succesfully");	
		}
		else {
			System.out.println("Client is Not Added");
		}
		} else if (c == 2) {
			//Delete

		} else if (c == 3) {
			//Display

		} else if (c == 4) {
			//Exit 

			break;

		} else {

		}
	}
	System.out.println("Thank you for using my Application...");
	System.out.println("See you soon... bye bye");

		}
		
		
	}


