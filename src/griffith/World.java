package griffith;

import java.util.Scanner;

public class World {
	public static void main(String []args) {
		System.out.println("Hello World");
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter first number");
		int num1 =scan.nextInt();
		
		System.out.println("Enter Second number");
		int num2 =scan.nextInt();	
		
		System.out.println("Enter third number");
		int num3 =scan.nextInt();
		
		int result = num1 + num2 + num3;
		System.out.println(num1 + "+" + num2 + "+"+num3+ "=" + result);
	}
      
}
