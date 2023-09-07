import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class WriteToFile{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			File f=new File("sample.txt");
			if(f.exists()==false) {
				if(f.createNewFile()) {
					System.out.println("File created sucessfully....");
					FileOutputStream out=new FileOutputStream(f);
					System.out.println("Enter the text to continue...");
					String text=sc.nextLine();
					out.write(text.getBytes());
					out.flush();
					out.close();
					System.out.println("\nData saved sucessfully...");
					System.out.println("The contents of file  ' sample.txt ' is..\n");
					FileInputStream in=new FileInputStream(f);
					int chara;
					while((chara=in.read())!=-1) {
						System.out.print((char)chara);
	     			}
					in.close();
					File f1=new File("new_sample.txt");
					if(f1.exists()==false) {
						if(f1.createNewFile()) {
							System.out.println("\n\nFile 'new_sample.txt' created sucessfully....");
							FileInputStream in1=new FileInputStream(f);
							FileOutputStream out1=new FileOutputStream(f1);
							int character;
							while((character=in1.read())!=-1)
							{
								out1.write(character);
							}
							in1.close();
							out1.close();
							System.out.println("The contents are copied successfully\n");
							System.out.println("The contents of file  ' new_sample.txt ' is..  \n");
							FileInputStream in2=new FileInputStream(f1);
							int charac;
							while((charac=in2.read())!=-1) {
								System.out.print((char)charac);
							}
							in2.close();
				    }
				    else
				    {
					   System.out.println("File not created....");
				     }
	              }
				  else
				  {
				    System.out.println("File not created....");
				  }
					
				}
			}
		}
		catch(IOException e) {
			System.out.println("File not created..\t File already exists...");
			e.printStackTrace();
		}
     }
}

