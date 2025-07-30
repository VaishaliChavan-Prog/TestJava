package TestJava;

public class ReverseString {
//Reverse string using for loop and chatAt method
	public static void main(String[] args) {
		
		String OriginalString ="Vaishali Chavan";
		String reversestring ="";
		
        for(int i=OriginalString.length()-1;i>=0;i--)
        {
        	reversestring=reversestring + OriginalString.charAt(i);
        }
            System.out.println("The length of String is :"+OriginalString.length()); 
            System.out.println("The Original string is : "+OriginalString);
            System.out.println("The Reversed string is : "+reversestring);
	}

}
