package banking_system_app;

import java.util.*;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}

class InvalidPINException extends Exception{
	public InvalidPINException(String message) {
		super(message);
	}
}

class BankAccount {
	private int accountNumber;
	private double balance;
	private int pin;
	
	public BankAccount(int accountNumber, double balance, int pin) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public int getPin() {
		return pin;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount > balance) {
			throw new InsufficientFundsException("Insufficient funds " + accountNumber);
		}
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}


public class BankingSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BankAccount[] account = {new BankAccount(123, 2500.0, 321), new BankAccount(456, 55500.0, 654), new BankAccount(789, 22200.0, 987), new BankAccount(147, 56800.0, 741)};
		
		try{
			System.out.println("Enter your account number: ");
			int accNr = scanner.nextInt();
			System.out.println("Enter your PIN: ");
			int enPin = scanner.nextInt();
			
			BankAccount yourAccount = null;
			
			for(BankAccount acc : account) {
				if(acc.getAccountNumber() == accNr) {
					yourAccount = acc;
					break;
				}
			}
			
			if(yourAccount == null) {
				throw new IllegalArgumentException("Account number not exist.");
			}
			if(enPin != yourAccount.getPin()) {
				throw new InvalidPINException("Wrong PIN " + accNr);
			}
			
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			int select = scanner.nextInt();
			
			if(select == 1) {
				System.out.println("Withdraw amount: ");
				double withdraw = scanner.nextDouble();
				yourAccount.withdraw(withdraw);
				System.out.println("Success. New balance: €" + yourAccount.getBalance());
			}else if(select == 2) {
				System.out.println("Enter deposit amount: ");
				double deposit = scanner.nextDouble();
				yourAccount.deposit(deposit);
				System.out.println("Success. New balance: €" + yourAccount.getBalance());
			}else {
				System.out.println("Wrong select.");
			}
			
		}catch(IllegalArgumentException | InvalidPINException | InsufficientFundsException e) {
			System.err.println("Error: " + e.getMessage());
		}finally {
			scanner.close();
		}

	}

}
