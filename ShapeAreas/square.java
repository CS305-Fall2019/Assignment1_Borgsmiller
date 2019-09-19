public class square implements areaInterface
{
	private double side;
	  
	public square(double side)
	{
		this.side = side;
	}
	
	@Override
	public double getArea() 
	{
		return (side * side);
	} 
	

}
