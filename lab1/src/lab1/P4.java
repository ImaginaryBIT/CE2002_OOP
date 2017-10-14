package lab1;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		
		int height, line, loop;
		
		System.out.println("Please key in height: ");
		
		Scanner sc = new Scanner(System.in);
		
		height = sc.nextInt();
		
		if(height <= 0) System.out.println("Error input!");
		
		else {
			
			for(line = 1; line<=height; line++)
			{
				
				for(loop = line; loop > 0; loop--)
				{
					
					if(loop % 2 != 0) System.out.print("AA");
					
					else System.out.print("BB");
					
				}
				
				System.out.println();
					
			}
				
		}

	}

}
