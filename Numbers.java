import java.util.StringTokenizer;
import java.util.Scanner;
public class Numbers {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers with a space between each number...");
		String numbers=sc.nextLine();
		StringTokenizer str=new StringTokenizer(numbers);
		System.out.println("The tokens of the given string are...");
		while(str.hasMoreTokens())
		{
			int num=Integer.parseInt(str.nextToken());
			System.out.println(num);
			sum=sum+num;
		}
		System.out.println("Sum of tokens  = "+sum);
		sc.close();
	}
}
