public class Square implements AreaInterface
{
	private double side;
	  
	public Square()
	{
	this.side = 0;
	}
	  
	public Square(double side)
	{
	this.side = side;
	}
	  
	public double getSide()
	{ 
		return this.side; 
	}
	
	@Override
	public double getArea() {
	return (side * side);
	} 
	

}
