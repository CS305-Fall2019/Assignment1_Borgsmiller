public class Rectangle implements AreaInterface{
private double width, height;
  
public Rectangle()
{
this.width = 0;
this.height = 0;
}

public Rectangle(double width, double height) {
this.width = width;
this.height = height;
}

public double getWidth() {
return width;
}

public double getHeight() {
return height;
}

@Override
public double getArea() {
return (width * height);
}
}