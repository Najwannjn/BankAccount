import java.util.Date;
import java.util.Scanner;

//Creating multiple objects by one type only

//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods

class Account {
	// Default Constructor
	Account() {
	};

	// Constructor to initialize object values
	Account(int a, String n, float amt) {
		this.acc_no = a;
		this.name = n;
		this.amount = amt;
		this.create_dt = new Date();
	};

	int acc_no;
	String name;
	float amount;
	Date create_dt;
	Date deposit_dt;
	Date withdraw_dt;

	// Method to initialize object
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}

	// deposit method
	void deposit(float amt) {
		amount = amount + amt;
		deposit_dt = new Date();
		System.out.println(amt + " deposited " + "at " + deposit_dt);
	}

	// withdraw method
	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			withdraw_dt = new Date();
			System.out.println(amt + " withdrawn " + "at " + withdraw_dt);
		}
	}

	// method to check the balance of the account
	void checkBalance() {
		System.out.println("Balance is: " + amount);
	}

	// method to display the values of an object
	void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}
}

//Creating a test class to deposit and withdraw amount  

 class Main {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.insert(832345, "Muhammed", 3000);
		a1.display();
		a1.checkBalance();
		// using constructor to create initialize account
		Account a2 = new Account(77548, "Najwan", 1000);
		//a2.display();
		Scanner s = new Scanner(System.in);
		System.out.println("Choose opertaion: 1 is deposit , 2 is withdraw");
		switch (s.nextInt()) {
		case 1:
			System.out.println("Enter deposit amount");
			a1.deposit(s.nextFloat());
			a1.checkBalance();
			break;
		case 2:
			System.out.println("Enter withdraw amount");
			a1.withdraw(s.nextFloat());
			a1.checkBalance();
		default:
			System.out.println("Invalid operation! try again");
			break;
		}

	}
}