public class circle implements areaInterface
{

	private double radius;
	  
	public circle(double radius)
	{
	this.radius = radius;
	}
	  
	@Override
	public double getArea() 
	{
	return(Math.PI * Math.pow(radius, 2));
	}
}
