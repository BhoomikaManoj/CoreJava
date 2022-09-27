class Car
{
	String name;
	int fuelQty;
	boolean isStarted;    // default value false

	public void start()
	{
		if(fuelQty > 0)
			isStarted = true;
		else
			System.out.println("no Fuel, Fill the fuel");
	}
	public void stop()
	{
		isStarted = false;
	}
	public void drive()
	{
		if(isStarted)
		{
			if(fuelQty == 0)
			{
				System.out.println("Car is stop beacuse no fuel");
				stop();
			}
			else
			{
				System.out.println(name + " Car is running");
				fuelQty--;
			}
		}
		else
			System.out.println("Start the car First");
	}

	public void reverse()
	{
		if(isStarted)
		{
			if(fuelQty == 0)
			{
				System.out.println("Car is stop beacuse no fuel");
				stop();
			}
			else
			{
				System.out.println(name + " Car is taking reversing");
				fuelQty--;
			}
		}
		else
			System.out.println("Start the car First");
	}
}
