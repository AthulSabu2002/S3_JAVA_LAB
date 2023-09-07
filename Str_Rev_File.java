import java.util.Scanner;
import java.io.*;
public class Str_Rev_File
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String text;
		int i = 0;
		char stack[];
		try
		{
			File f=new File("sample.txt");
			if(f.exists()==false)
			{
				if(f.createNewFile())
				{
					System.out.println("File created...");
					System.out.println("Enter the text : ");
					text=sc.nextLine();
					FileWriter fw=new FileWriter(f);
					fw.write(text);
					fw.flush();
					fw.close();
					FileReader fr=new FileReader(f);
					int chara,count=0;
					while((chara=fr.read())!=-1)
					{
						count++;
					}
					fr.close();
					FileReader fr1=new FileReader(f);
					int charac;
					stack=new char[count];
					while((charac=fr1.read())!=-1)
					{
				         stack[i]=((char)charac);
				         i++;
					}
					fr1.close();
					i=count-1;
					while(i!=-1) {
					System.out.print(stack[i]);
					i=i-1;
					}
				}
			}
			else
			{
				System.out.println("File already exists ..");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
