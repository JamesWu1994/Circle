import java.util.Scanner; 

public class TestCircle
{
	
	private static Scanner keyboard;
	public static void main (String[] args)
	{
		keyboard = new Scanner(System.in); 
		
		System.out.println("Please enter the circle's radius: "); 
		double radius = keyboard.nextDouble();
		
		Circle myCircle = new Circle(radius);
		System.out.println("The circle's area is: " + myCircle.getArea());
	}

}
