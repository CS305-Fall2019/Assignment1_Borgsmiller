public class Cube implements AreaInterface{

private double side;
  
public Cube()
{
this.side = 0;
}
  
public Cube(double side)
{
this.side = side;
}
  
public double getSide(){ return this.side;}
  
@Override
public double getArea() {
return (6 * Math.pow(side, 2));
}
}
