import java.util.Scanner;
class myClass1
{
	public void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Age not satisfied");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
}
public class ThrowDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.print("Enter your age : ");
		age=sc.nextInt();
		myClass1 m=new myClass1();
		m.validate(age);
	}

}
