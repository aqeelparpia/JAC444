/**********************************************
Workshop #1
Course: JAC444 - 4
Last Name: PARPIA
First Name: AQEEL
ID: 127921161
Section: JAC444SEE
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date:<FEB 13>
**********************************************/

package quest4;

public class Q4 {

	public static void main(String[] args) {
		// Creating Account, SavingsAccount and Checking Account
				Account account = new Account(1122, 20000);
				SavingsAccount savings = new SavingsAccount(1133, 20000);
				CheckingAccount checking = new CheckingAccount(1144, 20000);


				account.setAnnualInterestRate(4.5);
				savings.setAnnualInterestRate(4.5);
				checking.setAnnualInterestRate(4.5);

			
				account.withdraw(2500);
				savings.withdraw(2500);
				checking.withdraw(2500);

				
				account.deposit(3000);
				savings.deposit(3000);
				checking.deposit(3000);
				
				
				savings.withdraw(20600);
				checking.withdraw(20600);

				
				System.out.println(account.toString());
				System.out.println(savings.toString());
				System.out.println(checking.toString());

	}
	
}

class SavingsAccount extends Account{
	String printW = "";
	String printD = "";
	public SavingsAccount(){
		this(0,0);
	}
	
	public SavingsAccount(int ID, double balance){
		super(ID,balance);
	}
	
	public void withdraw(double withdrawAmount){
		double balance = this.getBalance();
		
		if(withdrawAmount > balance){
			printW ="Insufficient funds to withdraw $" + withdrawAmount + 
								" from Savings Account which cannot be overdrawn!";
		}
		else {
			balance -= withdrawAmount;
			this.setBalance(balance);
			printW ="The amount of $" + withdrawAmount + 
					" was withdrawn from Savings Account!";
		}
	}
	
	public void deposit(double depositAmount) {
		double balance = this.getBalance();
		balance += depositAmount;
		this.setBalance(balance);
		printD ="The amount of $" + depositAmount + 
				" was depositted to Savings Account!";
	}
	
	public String toString() {
	    return "\nSavings Account\n" +
	            "ID: " + getId() +
	            "\nBalance: " + getBalance() +
	            "\ndateCreated: " + getDateCreated() + 
	            "\n" + printW + 
	            "\n" + printD;
	}
	
}

class CheckingAccount extends Account {
	private final double overDraftLimit = 100.0; 
	String printW = "";
	String printD = "";
	public CheckingAccount(){
		this(0,0);
	}
	
	public CheckingAccount(int ID, double balance){
		super(ID,balance);
	}

	public void withdraw(double withdrawAmount){
		double balance = this.getBalance();
		if(withdrawAmount - balance > overDraftLimit){
			printW ="Insufficient funds to withdraw $" + withdrawAmount + 
					" from Checking Account which has $" +
					overDraftLimit + " overdraft limit!";
		}
		else {
			balance -= withdrawAmount;
			this.setBalance(balance);
			printW ="The amount of $" + withdrawAmount + 
					" was withdrawan from Checking Account which has $" + 
					overDraftLimit + " overdraft limit!";
		}
	}
	
	public void deposit(double depositAmount) {
		double balance = this.getBalance();
		balance += depositAmount;
		this.setBalance(balance);
		printD ="The amount of $" + depositAmount + 
				" was depositted to Checking Account!";
	}
	
	public String toString() {
	    return "\nChecking Account\n" +
	            "ID: " + getId() +
	            "\nBalance: " + getBalance() +
	            "\ndateCreated: " + getDateCreated() + 
	            "\n" + printW + 
	            "\n" + printD;
	}
}