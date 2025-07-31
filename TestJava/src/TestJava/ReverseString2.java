package TestJava;
import java.util.Scanner;
public class ReverseString2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String  :");
		String str=sc.nextLine();
		String reversestr=" ";
	    char ch;
	    for(int i=0;i<str.length();i++)
	    {
	    	ch=str.charAt(i);
	    	reversestr=ch+reversestr;
	    	
	    }
   System.out.println("The reverse string is :"+reversestr);
	}

}
