package lab1;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		//
		
		int salary,merit;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Please key in salary");
		
		salary = sc.nextInt();
		
		System.out.println("Please key in merit");
		
		merit = sc.nextInt();
		
		
		if(salary >= 500 && salary < 600) System.out.println("Grade C");

		else if(salary >= 600 && salary <= 649) {
			
			if (merit <10 ) System.out.println("Grade C");
			
			else System.out.println("Grade B");
			
		}
		
		else if(salary > 649 && salary < 700) System.out.println("Grade B");
		
		else if(salary >= 700 && salary <=799) {
			
			if(merit < 20) System.out.println("Grade B");
			
			else System.out.println("Grade A");
		}
		
		else if(salary >799) System.out.println("Grade A");
		
		else { i = 0;
			System.out.println("Out of salary range");
		}
		
	}while(i == 1);
	}

}
