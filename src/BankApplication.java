import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		BankAccount bankaccount = new BankAccount();
		
		Scanner input = new Scanner(System.in);
		double amount;
		
		while(true) {
			System.out.println("Your current balance is: " + bankaccount.getBalance());
			System.out.println("Choose an option: ");
			System.out.println("1) Deposit   2) Withdraw    3) Undo     4) Quit ");
			int answer = input.nextInt();
			if (answer == 1) {
				System.out.println("Enter deposit amount: ");
				amount = input.nextDouble();
				try {
					bankaccount.deposit(amount);
				} catch (DepositException e) {
					System.out.println("Please enter a positive amount!");
				}
			} else if (answer == 2) {
				System.out.println("Enter withdraw amount: ");
				amount = input.nextDouble();
				bankaccount.withdraw(amount);
			} else if (answer == 3) {
				System.out.println("We will undo the previous transaction.");
				bankaccount.rollback();
				System.out.println("Undo completed!");
			} else if (answer == 4) {
				System.out.println("Thank you for choosing BANK! See you again");
				break;
			}
		}
	}

}
