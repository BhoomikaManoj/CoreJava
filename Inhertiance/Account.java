class Account
{
	private double balance;

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public double checkBalance()
	{
		return balance;
	}

	public void deposit(double amount)
	{
		if(amount == 0)
			System.out.println("please enter the amount");
		else
			this.balance = this.balance + amount;
	}

	public void withdraw(double amount)
	{
		if(balance == 0)
		{
			System.out.println("You don't have any balance");
			return;
		}

		if(amount == 0 || amount < 0)
		{
			System.out.println("please enter the valid amount to withdraw");
			return;
		}

		if(amount > balance)
		{
			System.out.println("Entered amount is greater than balance amount. Can't withdraw");
			return;
		}

		balance -= amount;
		System.out.println("Remaining balance "+balance);
	}
}

class BankAccount extends Account
{
	public BankAccount(double amount)
	{
		if(amount == 0|| amount < 1000)
		{
			System.out.println("You have provided sufficent balance. You will not be able to use bank account");
			return;
		}
		if(amount>11000)
		{
			System.out.println("You can't deposit above limit");
			return;
		}
		deposit(amount);
	}
	public void withdraw(double amount)
	{
		if(amount == 0)
		{
			System.out.println("0 is invalid input");
			return;
		}
		if((checkBalance()-amount) < 1000)
		{
			System.out.println("Can't withdraw. Your balance may become below minimum");
			return;
		}
		if(checkBalance()==0)
		{
			System.out.println("Your account is not active first deposit above 999 and below 11000");
			return;
		}
		setBalance(checkBalance()-amount);
	}

	public void deposit(double amount)
	{
		if(amount == 0)
		{
			System.out.println("0 is invalid input");
			return;
		}
		if((checkBalance() + amount) > 11000)
		{
			System.out.println("Can't deposit balance exceding  11000");
			return;
		}
		setBalance(checkBalance() + amount);
	}
}
class CreditCardAccount extends Account
{
	public void withdraw(double amount)
	{
		if(amount == 0)
		{
			System.out.println("0 is invalid input");
			return;
		}
		if((checkBalance()-amount)<-15000)
		{
			System.out.println("Can't withdraw. Your balance may become below minimum -15000");
			return;
		}
		setBalance(checkBalance()-amount);
	}
}

class Person
{
	private String name;
	Account a;
	public void setName(String name)
	{
		if(name==null||name.trim().length()==0)
		{
			System.out.println("Invalid name");
			return;
		}
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	public void setAccount(Account a)
	{
		if(a==null)
		{
			System.out.println("Null is a invalid assingment");
			return;
		}
		System.out.println("Account succesfully assinged to "+name);
		this.a=a;
	}


	public void buy(String itemName,double d)
	{
		if(itemName==null||itemName.trim().length()==0)
		{
			System.out.println("Invalid input was given for buy");
			return;
		}
		if(a==null)
		{
			System.out.println("I don't have any account. Please link the account");
			return;
		}
		System.out.println("Let me check account balance before buying ");
		System.out.println("Balance is "+a.checkBalance());
		a.withdraw(d);
	}
}

class TestPerson
{
	public static void main(String args[])
	{
		Person p=new Person();
		p.setName("ABC");
		Account a1=new BankAccount(10000);
		p.setAccount(a1);
		p.buy("Carrot ",9000);
		a1.deposit(900);
		System.out.println(a1.checkBalance());
	}
}