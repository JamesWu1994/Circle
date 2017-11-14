public class Circle
{

	  private double radius;
	  final double PI = 3.14;
	  private double area;
	   
	  public Circle(double radius)
	  {
	    this.radius = radius;
	  }

	  public Circle()

	  {

	    radius = 0;
	  }
	  public void setRadius(double radius)

	  {
	    radius = radius;

	  }

	  public double getRadius()

	  {

	  return radius;

	  }

	  public double getArea()

	  {

	   return area = PI *radius * radius;

	  }
}
