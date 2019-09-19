public class cube implements areaInterface
{

	private double side;
  
	public cube(double side)
	{
		this.side = side;
	}
  
	@Override
	public double getArea() 
	{
		return (6 * Math.pow(side, 2));
	}
}
