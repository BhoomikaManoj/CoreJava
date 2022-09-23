public class TV
{
	boolean isSwitchOn;
	int volume;
	int channelNumber;

	public void switchOn()
	{
		isSwitchOn = true;
	}
	public void changeChannel(int i)
	{
		if(isSwitchOn)
		{
			if(i > 0 || i < 200)
				channelNumber = i;
			else
				System.out.println("Invalid channel number");
		}
		else
			System.out.println("Switch on the TV");
	}
	public void increment(int v)
	{
		if(isSwitchOn)
		{
			volume = volume + v;
		}
		else
			System.out.println("Switch on the TV");
	}
	public void decrement(int v)
	{
		if(isSwitchOn)
		{
			volume = volume - v;
		}
		else
			System.out.println("Switch on the TV");
	}
	public void display()
	{
		if(isSwitchOn)
		{
			System.out.println("channelNumber = " + channelNumber);
			System.out.println("volume = " + volume);
		}
		else
			System.out.println("Switch on the TV");
	}
	public static void main(String[] args)
	{
		TV tv1 = new TV();
		tv1.increment(12);
		tv1.switchOn();
		tv1.changeChannel(99);
		tv1.increment(31);
		tv1.decrement(10);
		tv1.display();
	}
}