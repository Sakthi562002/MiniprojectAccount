package com.qsp.main;

import com.qsp.account.Account;
import com.qsp.service.ServiceTransaction;
import com.qsp.user.BankUser;

public class Main {

	public static void main(String[] args) {
		Account a1 = new Account("SAKTHI",6385574484l);
		ServiceTransaction s = new ServiceTransaction();
		BankUser b = s.Login(1111);
		b.Transcation(5700, a1, 1);
		
		BankUser b1 = s.Login(2222);
		b1.Transcation(5700, a1, 1);
		b1.Transcation(2000, a1, 2);
		System.out.println(a1.getBal());
		
	}

}
