import java.util.Scanner;
public class MatrixMultiplication
   {	
		public static void main(String[] args)
		{	  
		  Scanner in=new Scanner(System.in);
		  int matrix1[][],matrix2[][],matrix3[][],m,n,r,c;
	      System.out.println("Enter the order of matrix");
		  m=in.nextInt();
		  n=in.nextInt();
		  System.out.println("Enter the order of second matrix");
		  r=in.nextInt();
		  c=in.nextInt();
		  if(n==r)
		    {
		      System.out.println("Enter the first matrix");
		      matrix1=new int[m][n];
		      for(int i=0;i<m;i++)
		        {
			      for(int j=0;j<n;j++)
			        {
				      matrix1[i][j]=in.nextInt();
			         }
		         }
		         System.out.println("Enter the second matrix");
		         matrix2=new int[r][c];
		         for(int i=0;i<r;i++)
		          {
			        for(int j=0;j<c;j++)
			         {
				        matrix2[i][j]=in.nextInt();
			         }
		          }
		          System.out.println("The resultant matrix is : ");
		          matrix3=new int[m][c];
		          for(int i=0;i<m;i++)
		           {
			         for(int j=0;j<c;j++)
			          {
				        for(int K=0;K<n;K++)
				         {
					       matrix3[i][j]=matrix3[i][j]+(matrix1[i][K]*matrix2[K][j]);	
				         }
		 	           }
		           }
		           for(int i=0;i<m;i++)
		            {
			          for(int j=0;j<c;j++)
			           {
				         System.out.print(matrix3[i][j]);
				         System.out.print("\t");
			            }
			            System.out.println("\n");
		             }
		       }
		       else
			     System.out.println("Matrix Multiplication not possible..");
		 }
  }
