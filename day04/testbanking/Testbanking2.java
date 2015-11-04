package testbanking;
import bank01.Account;
import bank02.Customer;

public class Testbanking2 {
	public static void main(String[] args) {
		Customer customer;
		Account account;
		
		System.out.println("Creating an account with a 500.00 balance.");
		account = new Account(500.00);
		System.out.println("Creating the customer Jane Smith");
		customer = new Customer("Jane", "Smith");
		customer.setAccount(account);
		
		System.out.println("Withdraw 150.00");
		customer.getAccount().withdraw(150.00);
		System.out.println("Deposit 22.50");
		customer.getAccount().deposit(22.50);
		System.out.println("Wothdraw 47.62");
		customer.getAccount().withdraw(47.62);
		System.out.println("Customer ["+customer.getFirstName()+","+customer.getLastName()
				+"]"+" has a balance of "+ customer.getAccount().getBalance());
	}		
}
