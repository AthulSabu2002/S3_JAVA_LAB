import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CreateFile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name for your file..");
		String name=sc.nextLine();
		try
		{
		    File f=new File(name);
			if(f.createNewFile())
			{
				System.out.println("Your file is created successfully....");
			}
			else
			{
				System.out.println("File not created...\t The file already exists");
			}	
		}
		catch(IOException e)
		{
			System.out.println("The file already exists!!!");
			e.printStackTrace();
		}
	}
}
