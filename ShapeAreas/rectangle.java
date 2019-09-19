public class rectangle implements areaInterface
{
	private double width, height;
	
	public rectangle(double width, double height) 
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