import java.util.Stack;

public class BankAccount {
	private double balance;
	
	private Stack<String> transactions = new Stack<>();
	private Stack<Double> amounts = new Stack<>();

	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		
		transactions.add("deposit");
		amounts.add(amount);
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
		
		transactions.add("withdraw");
		amounts.add(amount);
	}
	
	public double rollback() {
		String transaction = transactions.pop();
		double amount = amounts.pop();
		
		if (transaction.equals("deposit")) {
			this.balance -= amount;
		} else if (transaction.equals("withdraw")){
			this.balance += amount;
		} 
		return this.balance;
	}
}
