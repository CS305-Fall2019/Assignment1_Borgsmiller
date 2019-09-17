public class Circle implements AreaInterface{

private double radius;
  
public Circle()
{
this.radius = 0;
}
  
public Circle(double radius)
{
this.radius = radius;
}
  
public double getRadius(){ return this.radius; }
  
@Override
public double getArea() {
return(Math.PI * Math.pow(radius, 2));
}
}
