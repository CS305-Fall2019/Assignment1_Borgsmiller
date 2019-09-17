public class Square implements AreaInterface
{
	private double side;
	  
	public Square(double side)
	{
		this.side = side;
	}
	
	@Override
	public double getArea() 
	{
		return (side * side);
	} 
	

}
