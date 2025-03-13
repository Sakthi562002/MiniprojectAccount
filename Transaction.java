package com.qsp.transaction;

import com.qsp.account.Account;

public class Transaction {
	 public void Deposit(double amt,Account a) {
			if(amt > 0) {
				double b = a.getBal()+amt;
				a.setBal(b);

				System.out.println("Deposit Success");
			}
			else {
				System.out.println(" Enter valid amount");
			}
		
		}
	 
	 public void Withdraw(double amt,Account a) {
			if (a.getBal() >= amt) {
			 double b = a.getBal() - amt;
				a.setBal(b);

			 
				System.out.println("Withdraw Success");
			}
			else {
				System.out.println("Insuffucient Balance");
			}
		}
	 public void checkBal(Account a) {
		 System.out.println(a.getBal());
	 }
	}

