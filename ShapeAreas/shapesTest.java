
public class shapesTest 
{
  
	public static void main(String[]args)
	{
		triangle t = new triangle(3, 4, 5);
		System.out.println("Area of triangle: " + String.format("%.2f", t.getArea()));
		  
		square s = new square(4);
		System.out.println("Area of sqaure: " + String.format("%.2f", s.getArea()));
		  
		rectangle r = new rectangle(4, 6);
		System.out.println("Area of rectangle: " + String.format("%.2f", r.getArea()));
		  
		circle c = new circle(5);
		System.out.println("Area of circle: " + String.format("%.2f", c.getArea()));
		  
		cube cu = new cube(7);
		System.out.println("Area of cube: " + String.format("%.2f", cu.getArea()));
	}
}