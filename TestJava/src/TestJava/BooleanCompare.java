package TestJava;

public class BooleanCompare {
public static void main(String args[])
{
	int a=30,b=6;
	boolean isGreaterThan =(a>b);
	boolean isEqual =(a==b);
	boolean isNotEqual = (a!=b);
	boolean isLessThan = (b<a);
	
	System.out.println("A :"+a+ "   B :"+b);
	
	System.out.println("isGreaterThan :"+isGreaterThan);
	System.out.println("isEqual :"+isEqual);
	System.out.println("isNotEqual :"+isNotEqual);
	System.out.println("isLessThan :"+isLessThan);
}
}
