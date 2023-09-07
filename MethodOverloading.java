import java.util.Scanner;
class Shapes
{	
	void calculateArea(float x)
    {
        System.out.println("Area of the square with size "+x+": " +x*x+" sq units");
    }
	void calculateArea(float x, float y)
    {
        System.out.println("Area of the rectangle with length "+x+" breadth "+ y+" : "+x*y+" sq units");
    }
    void calculateArea(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle with radius " +r +" : "+area+" sq units");
    }
}
public class MethodOverloading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shapes shapesObj=new Shapes();
		System.out.println("Enter the size of the Square");
		float size=sc.nextFloat();
		shapesObj.calculateArea(size);
		System.out.println("Enter the Length and breadth of the Rectangle");
		float length=sc.nextFloat();
		float breadth=sc.nextFloat();
		shapesObj.calculateArea(length,breadth);
		System.out.println("Enter the radius of the Circle");
		double radius=sc.nextFloat();
		shapesObj.calculateArea(radius);
	}
}
