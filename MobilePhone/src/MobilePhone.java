
public abstract class MobilePhone 
{
	
	private String color;
	private int seriesNum;
	private static int numPhone = 0;
	
	//constructor
	public MobilePhone() 
	{
		color = "white";
		seriesNum = 0;
		numPhone++;
	}
	
	public MobilePhone(String color, int seriesNum) 
	{
		this.color = color;
		this.seriesNum = seriesNum;
		numPhone++;
	}
	
	//Mutator
	public void setPhoneSeries(int seriesNum) 
	{
		this.seriesNum = seriesNum;
	}
	
	public void setPhoneColor(String color) 
	{
		this.color = color;
	}
	
	//Accessory
	public int getPhoneSeries()
	{
		return seriesNum;
	}
	
	public String getPhoneColor()
	{
		return color;
	}
	
	//instance
	public void print()
	{
		System.out.println("This phone Series Number is " + seriesNum + " and color is " + color + ".");
	}
	
	//class
	public static int getNumPhone()
	{
		return numPhone;
	}
	
	public static void setNumPhone(int num)
	{
		 numPhone = num;
	}
	 
	public abstract void messager();

}
