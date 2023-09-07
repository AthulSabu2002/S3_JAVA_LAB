import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str1,rev="";
	System.out.println("Enter the String");
	str1=sc.next();
	int n = str1.length();
	for (int i = (n- 1); i >=0; --i)
      {
	      rev = rev + str1.charAt(i);
	  }
	  System.out.println("Reverse of the string is "+rev);
	  if(str1.equalsIgnoreCase(rev))
	    {
	    	System.out.println(str1 + " is a Palindrome String.");
	    }
	    else
	     {
	    	 System.out.println(str1 + " is not a Palindrome String.");
	     }
	}
}
