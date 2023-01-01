import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void testDeposit() {
		BankAccount bankaccount = new BankAccount();
		bankaccount.deposit(300.0);
		bankaccount.deposit(460.0);
		assertEquals(760.0, bankaccount.getBalance());
	}

	@Test
	void testWithdraw() {
		BankAccount bankaccount = new BankAccount();
		bankaccount.deposit(1000.0);
		bankaccount.withdraw(130.0);
		bankaccount.withdraw(5.0);
		assertEquals(865.0, bankaccount.getBalance());
	}

}
