package lab2;

import java.util.Scanner;

public class Lab2p1 {
	
	public static void main(String[] args){

		int choice;
		int m=0, n=0, digit;
		
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: miltiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			
			choice = input();
			
			switch (choice) {
			
			case 1: /* add mulTest() call */
				mulTest();
				break;
				
			case 2: /* add divide() call */
				System.out.println("Please key in an int for m");
				
				m = input();
				
				System.out.println("m = " + m);
					
				System.out.println("Please key in an int for n");
					
				n = positiveInput();
				
				System.out.println("n = " + n);
				
				System.out.println(m + " / " + n + " = " + divide(m,n));
				
				break;
				
			case 3: /* add modulus() call */
				System.out.println("Please key in an int for m");
				
				m = input();
				
				System.out.println("m = " + m);
					
				n = positiveInput();
				
				System.out.println("n = " + n);
				
				System.out.println(m + " % " + n + " = " + modulus(m,n));
				
				break;
				
			case 4: /* add countDigits() call */
				System.out.println("Please key in a positive integer");
				
				n = positiveInput();
				
				System.out.print("n : " + n + " - ");
				
				System.out.println(" count = " + countDigits(n));
				
				break;
				
			case 5: /* add position() call */
				System.out.println("Please key in a positive integer");
				
				n = positiveInput();
				
				System.out.println("n : " + n);
				
				System.out.println("Please key in an integer digit");
				
				digit = positiveInput();
				
				System.out.println("digit : " + digit);
				
				System.out.println("position = " + position(n, digit));
				
				break;
				
			case 6: /* add extractOddDigits() call */
				System.out.println("Please key in a positive integer");
				
				n = positiveInput();
				
				System.out.print("n : " + n );
				
				System.out.println(" oddDigits = " + extractOddDigits(n));
				
				break; 
				
			case 7: System.out.println("Program terminating ….");
			}
			
		} while (choice < 7);
	}
	
	//option #1
	public static void mulTest() 
	{
		
		int numQuetion, numRight = 0, anwser, rightAnwser, num1, num2;
		
		for(numQuetion = 5; numQuetion > 0; numQuetion--) 
		{
			
			num1 = (int)(Math.random()*10);
			
			num2 = (int)(Math.random()*10);
			
			System.out.println("How much is " + num1 + " times " + num2 + " ? ");
			
			anwser = input();
			
			rightAnwser = num1 * num2;
			
			if(anwser == rightAnwser) numRight++;
			
		}
		
		System.out.println(numRight + " anwsers out of 5 are correct.");
		
	}
	
	//option #2
	public static int divide(int m, int n) 
	{
		
		int count = 0;
		
		while(m - n >= 0)
		{
			m = m - n;
			
			count++;
		}
		
		return count;
	}
	
	//option #3
	public static int modulus(int m, int n) 
	{
		
		if(m < n) return m;
		
		else 
		{
			
			do
			{
				m = m - n;
				
			}while(m >= n);
			
			return m;
			
		}
		
	}
	
	//option #4
	public static int countDigits(int n) 
	{
		
		int numDigit = 0;	
		
		while(n>0) 
		{
			
			n = n / 10;
			numDigit++;
		}
		
		return numDigit;
	}
	
	//option #5
	
	public static int position(int n, int digit) 
	{
		
		int position = -1, time = 1;
		
		while(n > 0) 
		{
			
			if(n % 10 != digit) 
			{

				n/=10;
				
				time++;
				
			}
			
			else
			{
				position = time;
				
				break;
			}
			
		}
		
		return position;
	}
	
	//option #6
	public static int extractOddDigits(int n) 
	{
		int oddDigits = 0, mul = 1, num;
		
		while(n > 0) 
		{
			num = n % 10;
			
			if(num % 2 != 0) 
			{
				
				oddDigits = oddDigits + num * mul;
				
				mul *= 10;
			}
			
			n /= 10;
			
		}
		
		if (oddDigits == 0) return -1;
		
		else return oddDigits;
	}
	
	public static int input() {

		int input = 0;

		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) {

			System.out.println("Wrong input type! Please key in an integer!");

			sc.next();
		}

		input = sc.nextInt();

		return input;

	}
	
	public static int positiveInput() {

		int input = 0;

		Scanner sc = new Scanner(System.in);

		while (input <= 0) {

			while (!sc.hasNextInt()) {

				System.out.println("Error! Please key in an integer!");

				sc.next();
			}

			input = sc.nextInt();

			if (input <= 0)
				System.out.println("Error! Please key in a positive integer!");

		}

		return input;
	}
}