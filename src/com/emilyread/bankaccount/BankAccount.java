package com.emilyread.bankaccount;
import java.util.Random;


public class BankAccount {
	private double checkingBalance;
	private double savingsBalance;
	private static int numberOfAccounts=0;
	private static double bankTotal=0;
	private String accountNumber;
	
	public BankAccount() {
		this.checkingBalance=0;
		this.savingsBalance=0;
		this.accountNumber=generateAccountNumber();
		
		numberOfAccounts++;
	}
	
	public double getCheckingBalance() {
		System.out.println("Checking Balance is: $"+ this.checkingBalance);
		return checkingBalance;
	}
	public double getSavingsBalance() {
		System.out.println("Savings Balance is: $"+ this.savingsBalance);
		return savingsBalance;
	}
	
	public String getaccountNumber() {
		return accountNumber;
	}

	public void addToAccount(String acct, double amount) {
		if (acct =="checking") {
			this.checkingBalance+=amount;
			System.out.println("Added $"+ amount + " to Checking Account. Checking Balance is now: $"+ this.checkingBalance);
		}
		else if (acct =="savings") {
			this.savingsBalance+=amount;
			System.out.println( "Added $"+ amount + " to Savings Account. Savings Balance is now: $"+ this.savingsBalance);
		}
		else {
			System.out.println("Not a valid account type");
		}
				
		bankTotal+=amount;
	}
	
	public void withdrawFromChecking(double amount) {
		if (this.checkingBalance>amount) {
			this.checkingBalance-=amount;
			System.out.println("Withdrew $"+ amount + " from Checking Account. Checking Balance is now: $"+ this.checkingBalance);
		}
		else {
			System.out.println("Not enough funds in Checking Account to withdraw $" + amount);
		}
	}

	public void withdrawFromSavings(double amount) {
		if (this.savingsBalance>amount) {
			this.savingsBalance-=amount;
			System.out.println( "Withdrew $"+ amount + " from Savings Account. Savings Balance is now: $"+ this.savingsBalance);
		}
		else {
			System.out.println("Not enough funds in Savings Account!");
		}
	}
	
	public double seeTotal() {
		double accountsTotal = this.savingsBalance + this.checkingBalance;
		System.out.println("Total money in both accounts: $" + accountsTotal);
		return accountsTotal; 	
	}
	
	private static String generateAccountNumber() {
		String acctNo= new String();
		
		for (int i=0; i<8; i++){
			Random r= new Random();
			acctNo += r.nextInt(10);
        }
		return acctNo;	
	}
}
