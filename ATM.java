package com.qsp.user;

import com.qsp.account.Account;
import com.qsp.transaction.Transaction;

public class ATM implements BankUser {
	
		 @Override
		 public  void Transcation(double amt,Account a,int choice) {
			 Transaction t = new Transaction();
			 switch(choice) {
			 case 1: t.Deposit(amt, a);
			 break;
			 case 2: t.Withdraw(amt, a);
			 break;
			 case 3: t.checkBal(a);
			 break;
			 default:System.out.println("invalid choice");
			 }
		 }
		 

}
