import java.util.Scanner;
public class FrequencyCount 
{
	public static void main(String[] args)
	  {
	    Scanner in=new Scanner(System.in);
	    String str;
	    char ch;
	    int length,count;
	    count=0;
	    System.out.println("Enter the string");
        str=in.nextLine();
        str=str.toLowerCase();
        System.out.println("Enter the character :");
        ch=in.next().charAt(0);
        ch=Character.toLowerCase(ch);
        length=str.length();
        for(int i=0;i<length;i++)
	      {   
	    	  if(ch == str.charAt(i))
	    	    {
	    		   count++;
	    	    }
	      }
	        System.out.println("The character " +ch +" repeats " + count +" times ");
	  }

}

