import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, a=0, b=1, c;

        System.out.print("Enter the limit : ");
        num = input.nextInt();
        for(int i=0; i<num; i++){
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }
    }
}
