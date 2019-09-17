public class Cube implements AreaInterface
{

	private double side;
  
	public Cube(double side)
	{
		this.side = side;
	}
  
	@Override
	public double getArea() 
	{
		return (6 * Math.pow(side, 2));
	}
}
