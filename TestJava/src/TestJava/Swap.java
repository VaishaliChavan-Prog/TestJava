package TestJava;

public class Swap {
//Swapping two numbers without third variable
	public static void main(String[] args) {
		int x=10,y=30;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X :"+x);
		System.out.println("Y :"+y);

	}

}
