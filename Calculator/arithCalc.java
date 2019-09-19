import java.lang.Math;
import java.util.Scanner;

public class arithCalc
{
  private double x1, x2;
  private Scanner sc;
  public char op;
  public double result;

  public arithCalc()
  {
    sc = new Scanner(System.in);

    do
    {
      System.out.println("Please enter a valid operator: + - * / ^ ! r(sqrt) \n Or Press q to quit Calculator");
      opSet();
    } while(op != 'q');
    
    System.out.println("Please enter first value");
    x1 = sc.nextInt();
    
    System.out.println("Please enter second value (if factorial or sqrt then put any value)");
    x2 = sc.nextInt();
  }
  
  public char opSet()
  {
    op = (char)sc.nextLine().charAt(0);
    return op;
  }
  
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
  
