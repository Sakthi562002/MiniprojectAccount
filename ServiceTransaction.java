package com.qsp.service;

import com.qsp.user.ATM;
import com.qsp.user.BankUser;
import com.qsp.user.Gpay;
import com.qsp.user.Phonepay;

public class ServiceTransaction {
	public BankUser Login(int pin) {
		
		switch(pin) {
		case 1111:{
			BankUser b = new ATM();
			return b;
		}
		case 2222:{
			BankUser b = new Phonepay();
			return b;
		}
	
		case 3333:{
			BankUser b = new Gpay();
			return b;
		}

		default:{
			System.out.println("Enter valid pin number");
			return null;
		}
		
		}
	}
}
