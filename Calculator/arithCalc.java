import java.lang.Math;

public class arithCalc
{
  public double x1, x2, result;
  
  public double getFirst()
  {
    return this.x1;
  }
  
  public double getSecond()
  {
    return this.x2;
  }
  
  public double calcSum()
  {
    return this.x1 + this.x2;
  }
  
  public double calcSub()
  {
    return this.x1 - this.x2;
  }
  
  public double calcMult()
  {
    return this.getFirst() * this.getSecond();
  }
  
  public double calcDiv()
  {
    double zeroCheck = this.getSecond();
    
    if(zeroCheck == 0)
      return 0;
    
    return this.getFirst() / zeroCheck;
  }
  
  public double calcSqroot()
  {
    return Math.sqrt(this.getFirst()); 
  }
  
  public double calcPower()
  {
    return Math.pow(this.getFirst(), this.getSecond());
  }
  
  public double calcFactorial()
  {
    int fact=1;  
  
    for(int i=1; i<=this.getFirst(); i++)
    {    
        fact=fact*i;  
    }
    
    return fact;
  }
  
}
  
