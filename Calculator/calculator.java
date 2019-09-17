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
    
    System.out.println("Please enter second value");
    x2 = sc.nextInt();
  }
  
  public char opSet()
  {
    op = (char)sc.nextline().charAt(0);
    return op;
  }
  
  public int calcSum()
  {
    return this.x1 + this.x2;
  }
  
  public int calcSub()
  {
    return this.x1 - this.x2;
  }
  
  public int getFirst()
  {
    return this.x1;
  }
  
  public int getSecond()
  {
    return this.x2;
  }
  
}

public class specCalc extends arithCalc
{
  public specCalc()
  {
    super();
  }
  
  
  public int calcMult()
  {
    this.getFirst() * this.getSecond();
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
    this.getFirst() 
  }
  
  public int calcPower()
  {
    this.getFirst() ^ this.getSecond();
  }
  
  public int calcFactorial()
  {
    
  }

}



public class Calculator 
{

  public static void main(String[] args)
  {
    arithCalc c = new arithCalc();
    
    do
    {
      System.out.println("Please enter a valid operator: + - * / ^ f(factorial) r(root)");
      c.opSet();
    } while(c.op != '+' && c.op != '-' && c.op != '*' && c.op != '/' && c.op != '^'
      && c.op != 'f' && c.op!= 'r');
    
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
      case 'f':
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
