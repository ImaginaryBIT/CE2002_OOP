

public class MobilePhoneAPP {

	public static void main(String args[]) {

		MobilePhone phone1 = new TwoGPhone("red", 123, 5);
		
		phone1.print();
		
		phone1.messager();

		TwoGPhone phone2 = new TwoGPhone("White", 123, 6);
		
		phone2.Ring();
		
		phone2.setPhoneColor("Black");
		
		phone2.print();

		System.out.println("The number of phone created is " + MobilePhone.getNumPhone());
		
		phone2.setNumPhone(0);
		
		System.out.println("The number of phone created is " + MobilePhone.getNumPhone());

		TwoGPhone phone3 = (TwoGPhone) phone1;
		
		if(phone3 instanceof MobilePhone)
		{
			System.out.println("im safe");
		}
		

	}

}
