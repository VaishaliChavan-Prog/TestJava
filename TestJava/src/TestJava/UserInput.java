package TestJava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		int age;
		String UserName;
		Scanner name = new Scanner(System.in); // create scanner object
		System.out.println("Enter user name :");
		UserName=name.nextLine(); // user input string data type
		
		Scanner age1 = new Scanner(System.in);
		System.out.println("Enter Age :"); 
		age=(int) age1.nextInt(); // user input integer data type
		
		
		
		

	}

}
