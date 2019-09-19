public class triangle implements areaInterface
{
	private double side1, side2, side3;
	
	
	public triangle(double side1, double side2, double side3) 
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public double getArea() 
	{
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
}