
public class TwoGPhone extends MobilePhone{
	
	private int screenSize;
	private static int numPhone;

	public TwoGPhone() 
	{
	super();
	screenSize = 0;
	}
	
	public TwoGPhone(String color, int seriesNum, int screenSize) 
	{
		super(color,seriesNum);
		this.screenSize = screenSize;
	}
	
	public void Ring()
	{
		System.out.println("The phone " + super.getPhoneSeries() + " is ringing!");
	}
	
	public void print()
	{
		System.out.println("The phone " + super.getPhoneSeries() + " color is " + super.getPhoneColor() + ".");
	}
	
	public void messager()
	{
		System.out.println("hello motor");
	}
	
	//public static void setNumPhone(int num)
	//{
		// numPhone = num;
	//}

}
