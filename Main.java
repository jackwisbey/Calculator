package calculator;

import java.util.Scanner; 

public class Main{
  
  public static void main(String[] args)
  {
   int num1=0;
   int num2=0;
   char operator;
   double answer= 0.0;

   Scanner sc=new Scanner(System.in);

   System.out.println("Please enter first number: ");
   num1 = scanObject.nextInt();
   System.out.println("Please enter second number: ");
   num2 = scanObject.nextInt();
   System.out.println("What operation? ");
   operator = scanObject.next().charÀt(0);

   switch (operator) {
      case '+':answer=num1+num2;
        break;
      case '-':answer=num1-num2;
        break;
      case '*':answer=num1*num2;
        break;
      case '/':answer=num1/num2;
        break;
   } 
   
   System.out.println(num1+" "+operator+" "+num2+" = "+answer);
  }
}