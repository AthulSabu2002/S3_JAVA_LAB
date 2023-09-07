import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class EvenOddFile{
public static void main(String[] args){
  int array[];
  Scanner sc=new Scanner(System.in);
  try
  {
    File f=new File("numbers.txt");
    if(f.createNewFile())
    {
      System.out.println("File created Successfully!!");
      System.out.println("How many Numbers are you going to enter?");
      FileWriter FW=new FileWriter(f);
      int size=sc.nextInt();
      array=new int[size];
      System.out.println("Enter the numbers");
      for(int i=0;i<size;i++)
      {
        array[i]=sc.nextInt();
        FW.write(array[i]);
      }
      FW.flush();
      FW.close();
      System.out.println("The contents of the file are ...");
      FileReader Fr=new FileReader(f);
      int num;
      while((num=Fr.read())!=-1)
      {
        System.out.println(num);
      }
      Fr.close();
      System.out.println("Differentiating Even and Odd numbers from file.....");
        File f1=new File("even.txt");
        if(f1.createNewFile())
        {
          File f2=new File("odd.txt");
          if(f2.createNewFile())
          {
            System.out.println(" 'even.txt' created succesfully");
            System.out.println(" 'odd.txt' created successfully...");
            FileWriter Fw1=new FileWriter(f1);
            FileWriter Fw2=new FileWriter(f2);
            FileReader Fr1=new FileReader(f);
            int numb;
            while((numb=Fr1.read())!=-1)
            {
            	if(numb%2==0)
                Fw1.write(numb);
                else
                Fw2.write(numb);
            }
            Fw1.flush();
            Fw1.close();
            Fw2.flush();
            Fw2.close();
            System.out.println("The contents of the file 'even.txt' are ...");
            FileReader Fr2=new FileReader(f1);
            int num1;
            while((num1=Fr2.read())!=-1)
            {
              System.out.println(num1);
            }
            Fr2.close();
            System.out.println("The contents of the file 'odd.txt' are ...");
            FileReader Fr3=new FileReader(f2);
            int num2;
            while((num2=Fr3.read())!=-1)
            {
              System.out.println(num2);
            }
            Fr3.close();
           }
          else
        	  System.out.println("File not created. The file may already exists");
        }
        else
      	  System.out.println("File not created. The file may already exists");
     }
     else
     {
       System.out.println("File not created.......The file may already exists");
     }

   }
   catch(IOException e)
   {
     e.printStackTrace();
   }
 }
}
