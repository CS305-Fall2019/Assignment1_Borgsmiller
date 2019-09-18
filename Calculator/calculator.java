import java.lang.Math;

public class arithCalc
{
  private int x1, x2;
  private Scanner sc;
  public char op;
  public int result;

  public arithCalc()
  {
    sc = new Scanner(System.in);
    
    System.out.println("Please choose calculator operation");
    op = (char) sc.nextline().charAt(0);
    
    System.out.println("Please enter first value");
    x1 = sc.nextInt();
    
    System.out.println("Please enter second value (if factorial or sqrt then put any value)");
    x2 = sc.nextInt();
  }
  
  public char opSet()
  {
    op = (char)sc.nextline().charAt(0);
    return op;
  }
  
  public int getFirst()
  {
    return this.x1;
  }
  
  public int getSecond()
  {
    return this.x2;
  }
  
  
  
  public int calcSum()
  {
    return this.x1 + this.x2;
  }
  
  public int calcSub()
  {
    return this.x1 - this.x2;
  }
  
  public int calcMult()
  {
    return this.getFirst() * this.getSecond();
  }
  
  public int calcDiv()
  {
    int zeroCheck = this.getSecond();
    
    if(zeroCheck == 0)
      return 0;
    
    return this.getFirst() / zeroCheck;
  }
  
  public int calcSqroot()
  {
    return Math.sqrt(this.getFirst()); 
  }
  
  public int calcPower()
  {
    return Math.pow(this.getFirst, this.getSecond);
  }
  
  public int calcFactorial()
  {
    int fact=1;  
  
    for(i=1; i<=this.getFirst(); i++)
    {    
        fact=fact*i;  
    }
    
    return fact;
  }
  
}
  


public class Calculator 
{

  public static void main(String[] args)
  {
    arithCalc c = new arithCalc();
    
    do
    {
      System.out.println("Please enter a valid operator: + - * / ^ ! r(root)");
      c.opSet();
    } while(c.op != '+' && c.op != '-' && c.op != '*' && c.op != '/' && c.op != '^'
      && c.op != '!' && c.op!= 'r');
    
    switch(c.op)
    {
      case '+':
            c.result = c.calcSum();
            break;
      case '-':
            c.result = c.calcSub();
            break;
      case '*':
            c.result = c.calcMult();
            break;
      case '/':
            c.result = c.calcDiv();
            break;
      case '^':
            c.result = c.calcPower();
            break;
      case '!':
            c.result = c.calcFactorial();
            break;
      case 'r':
            c.result = c.calcSqroot();
            break;
      default:
            break;
   }
   
   system.out.println(c.result);
  }
}
