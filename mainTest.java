
public class ShapesTest {
  
public static void main(String[]args)
	{
	Triangle triangle = new Triangle(3, 4, 5);
	System.out.println("Area of triangle: " + String.format("%.2f", triangle.getArea()));
	  
	Square square = new Square(4);
	System.out.println("Area of sqaure: " + String.format("%.2f", square.getArea()));
	  
	Rectangle rectangle = new Rectangle(4, 6);
	System.out.println("Area of rectangle: " + String.format("%.2f", rectangle.getArea()));
	  
	Circle circle = new Circle(5);
	System.out.println("Area of circle: " + String.format("%.2f", circle.getArea()));
	  
	Cube cube = new Cube(7);
	System.out.println("Area of cube: " + String.format("%.2f", cube.getArea()));
}
}