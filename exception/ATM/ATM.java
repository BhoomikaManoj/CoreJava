package com.uttara.exception.ATM;

public class ATM {

	public void withDraw(Card c, double amount) throws NotEnoughMoneyInCardException {
		if (c == null)
			throw new IllegalArgumentException("Card is null, you fool...pass non-null card for withdrawal!");

		if (amount < 0)
			throw new IllegalArgumentException("cannot with draw negative amount");

		if (c.balance < amount)
			throw new NotEnoughMoneyInCardException("Not enough Money in your card");
		c.balance = c.balance - amount;
	}
}

class TestATM {
	public static void main(String[] args) {
		try {
			ATM a = new ATM();
			Card c = new Card("1234", 2000);
			System.out.println("going to withdraw() amount");
			a.withDraw(c, 3400);
			System.out.println("after withdrawal Net Balance is = " + c.balance);
			System.out.println("doing other things...");
		} catch (Throwable t) {
			System.out.println("Oops = " + t.getMessage());
			t.printStackTrace();

		}
	}
}
