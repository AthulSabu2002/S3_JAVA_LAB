import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
public class Writefile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name to cotinue...");
		String name=sc.nextLine();
		try {
			File f=new File(name);
			if(f.exists()==false) {
				System.out.println("File does not exist...");
				System.exit(0);
			}
			FileInputStream in=new FileInputStream(f);
			int character;
			while((character=in.read())!=-1) {
				System.out.println((char)character);
			}
			in.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!!!!");
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("File not found!!!!");
			e.printStackTrace();
		}
	}
}
