
public interface IPhone {
	
	public void setPhoneSeries(int seriesNum) ;
	
	public void setPhoneColor(String color) ;
	
	//Accessory
	public int getPhoneSeries();
	
	public String getPhoneColor();
	
	//instance
	public void print();
	 
	public abstract void messager();

}
