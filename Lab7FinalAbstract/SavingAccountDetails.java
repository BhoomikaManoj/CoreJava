public abstract class SavingAccountDetails
{
	public abstract void PrintData();
}
abstract class CurrentAccountDetails extends SavingAccountDetails
{
	public void PrintData()
	{
		System.out.println("Current account details");
	}
}
class Balance extends CurrentAccountDetails
{
	public void PrintData()
	{
		System.out.println("Balance");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Balance b = new Balance();
		b.PrintData();
	}
}