import java.util.Scanner;
import java.io.*;
public class PrimeNumbersFile
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name : ");
		String name=sc.nextLine();
		try
		{
			File f=new File(name);
			if(f.exists()==false)
			{
				if(f.createNewFile())
				{
					System.out.println("The file created...");
					FileOutputStream out=new FileOutputStream(f);
					System.out.println("Enter the limit : ");
					int limit=sc.nextInt();
					int i,j,count;
					for(i=2;i<=limit;i++)
					{
						j=2;
						count=0;
						while(j<=i/2)
						{
							if(i%j==0)
							{
								count++;
								break;
							}
							j++;
						}
						if(count==0)
						{
							out.write(i);
						}
					}
					out.flush();
					out.close();
					FileInputStream in=new FileInputStream(f);
					int num;
					while((num=in.read())!=-1)
					{
						System.out.println(num);
					}
					in.close();
				}
			}
			else
			{
				System.out.println("The file alresdy exists..");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
