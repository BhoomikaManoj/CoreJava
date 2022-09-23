public class Account
{
	String ownerName;
	String accountNumber;
	double balance;

	public void withDraw(double amt)
	{
		if(amt < balance)
		{
			balance = balance - amt;
			System.out.print("After WithDraw the amount,");
			checkBalance();
		}
		else
			System.out.println("In- Sufficient balance");
	}

	public void debit(double amt)
	{
		if(amt < 0)
			System.out.println("Enter corrent amount");
		else
		{
			balance = balance + amt;
			System.out.print("After Debiting the amount, ");
			checkBalance();
		}
	}

	public void checkBalance()
	{
		System.out.println("Current Balance is " +balance);
	}

	public static void main(String[] args)
	{
		System.out.println("person 1");
		Account a1 = new Account();
		a1.ownerName = "Abc";
		a1.accountNumber = "abc123";
		a1.debit(14566.90);
		a1.withDraw(1000);
		System.out.println("person 1");
		Account a2 = new Account();
		a2.ownerName = "Abcd";
		a2.accountNumber = "abc1234";
		a2.debit(1466.90);
		a2.withDraw(100);
	}
}