import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double a;
      double b;
      double res;
      char c;
      Scanner x = new Scanner(System.in);
      System.out.print("Enter a and b: ");
      a = x.nextDouble();
      b = x.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      c = x.next().charAt(0);
      switch(c) {
         case '+': res = a + b;
            break;
         case '-': res = a - b;
            break;
         case '*': res= a * b;
            break;
         case '/': res = a / b;
            break;
         default:  System.out.printf("choose valid operation");
            return;
	}
      System.out.print("\nResult is:\n");
      System.out.printf(a + " " + c + " " + b + " = " + res);
   }
}