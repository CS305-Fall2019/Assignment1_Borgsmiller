
public class calculator 
{

  public static void main(String[] args)
  {
    arithCalc c = new arithCalc();
    
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
   
   System.out.println(c.result);
  }
}
