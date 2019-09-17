public class Rectangle implements AreaInterface
{
	private double width, height;
	
	public Rectangle(double width, double height) 
	{
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() 
	{
		return (width * height);
	}
}