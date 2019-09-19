import java.util.Scanner;

public class calculator 
{

public static void main(String[] args)
  {
    arithCalc c = new arithCalc();
     char op;

    Scanner sc = new Scanner(System.in);

    do
    {
      System.out.println("Please enter a valid operator: + - * / ^ ! r(sqrt) \n Or Press q to quit Calculator");
      op = sc.next().charAt(0);
      
      if (op == 'q')
      {
    	  sc.close();
      		return;
      }

      System.out.println("Please enter first value");
      c.x1 = sc.nextDouble();
      
      System.out.println("Please enter second value (if factorial or sqrt then put any value)");
      c.x2 = sc.nextDouble();
      
      switch(op)
      {
        case '+':
              c.result = c.calcSum();
              System.out.println(c.result);
              break;
        case '-':
              c.result = c.calcSub();
              System.out.println(c.result);
              break;
        case '*':
              c.result = c.calcMult();
              System.out.println(c.result);
              break;
        case '/':
              c.result = c.calcDiv();
              System.out.println(c.result);
              break;
        case '^':
              c.result = c.calcPower();
              System.out.println(c.result);
              break;
        case '!':
              c.result = c.calcFactorial();
              System.out.println(c.result);
              break;
        case 'r':
              c.result = c.calcSqroot();
              System.out.println(c.result);
              break;
        default:
              break;
     }
      
    } while(op != 'q');
  
  sc.close();
    
  }
}
