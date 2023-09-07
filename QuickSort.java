import java.util.Scanner;
class sort
{
	String temp;
	 void Sort(String array[],int first,int last)
	 {
		if(first<last) {
		int pivot;
		pivot=first;
		int i=first;
		int j=last;
		while(i<j)
		{
		  while(array[i].compareTo(array[pivot])<0&&i<last)
			i++;
		  while(array[j].compareTo(array[pivot])>0)
			j--;
		  if(i<j) 
		  {
			  temp=array[i];
			  array[i]=array[j];
			  array[j]=temp; 
		  }
		}
		temp=array[j];
		array[j]=array[pivot];
		array[pivot]=temp;
		Sort(array,first,j-1);
		Sort(array,j+1,last);
	}
  }
}
public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=0;
		String array[];
		System.out.print("How many names are you going to enter ?");
		size=sc.nextInt();
		array=new String[size];
		System.out.println("Enter the names :");
		for(int i=0;i<size;i++)
			array[i]=sc.next();
		sort s=new sort();
		System.out.println("The names you entered are :");
		for(int i=0;i<size;i++)
			System.out.println(array[i]);
		s.Sort(array, 0, size-1);
		System.out.println("The sorted name list is :");
		for(int i=0;i<size;i++)
			System.out.println(array[i]);
	}

}
