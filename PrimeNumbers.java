import java.util.Scanner;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit,i,j,count=0;
		limit = sc.nextInt();
		for(i=1;i<limit;i++)
		{
			j=2;
			while(j<=i/2)
			{
				count=0;
				if(i%j==0)
				{
						count++;
						break;
				}
				j++;
			}
			if(count==0)
				System.out.println(i);
     	}
		
	}
}
