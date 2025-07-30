package TestJava;

public class ReversedString {
	
	//Reversed string using string builder method
	public static void main(String args[])
	{
		String OriginalString ="Vaishali Chavan";
		StringBuilder sb = new StringBuilder(OriginalString);
		sb.reverse(); // reversed string in stingBuilder method
		String reversestring =sb.toString();
		
		//System.out.print("sb data :"+sb);
		
		
		 System.out.println("The length of String is :"+OriginalString.length()); 
         System.out.println("The Original string is : "+OriginalString);
         System.out.println("The Reversed string is : "+reversestring);
		
	}

}
