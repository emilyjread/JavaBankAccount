package com.emilyread.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b1= new BankAccount();
		BankAccount b2= new BankAccount();
		
		b1.getCheckingBalance();
		b1.getSavingsBalance();
		
		b1.addToAccount("checking", 500);
		b1.addToAccount("savings", 200);
		b1.addToAccount("other", 100);
		
		
		b1.withdrawFromChecking(50);
		b1.withdrawFromSavings(100);
		b1.withdrawFromChecking(1000);
		
		b1.seeTotal();
		b2.seeTotal();
		
		System.out.println(b1.getaccountNumber());
		System.out.println(b1.getaccountNumber());
		System.out.println(b2.getaccountNumber());
	}

}
