import java.util.Scanner;

public class ExceptionHandlingDemo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		
		System.out.print("MENU\n1) Arithmetic Exception \n2) Array Index Out Of Bounds Exception\n3) Exit\n");
		do {
			System.out.print("\nEnter the option : ");
			option = sc.nextInt();
			
			switch(option) {
			
			case 1:
				try {
					int num1, num2;
					System.out.println("Program to perform division");
					System.out.print("Enter number 1 : ");
					num1 = sc.nextInt();
					System.out.print("Enter number 2 : ");
					num2 = sc.nextInt();
					System.out.println("Result="+num1/num2);
					System.out.println("End of try block.");
				} catch(ArithmeticException e) {
					System.out.println(e);
				} finally {
					System.out.print("finally block content\nMy code is safe from Exception.\n");
				}
				break;
				
			case 2:
				try {
					int size, pos;
					System.out.print("Enter number of elements to store in array : ");
					size = sc.nextInt();
					int[] arr = new int[size];
					System.out.print("Enter the elements : ");
					for(int i=0; i<size; i++) {
						arr[i] = sc.nextInt();
					}
					System.out.print("Enter the postion to be accessed : ");
					pos = sc.nextInt();
					System.out.println("Element is : " + arr[pos]);
					System.out.println("End of try block.");
				} catch(Exception e) {
					System.out.println(e);
				} finally {
					System.out.print("finally block content\nMy code is safe from Exception.\n");
				}
				break;
			case 3:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Select a valid option (1 or 2) ");
			}
		} while(option != 3);		
	}
}
