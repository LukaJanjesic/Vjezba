package JAVA;
import java.util.Scanner;
public class Kalkulator {
      public static void main (String args[]) {
    	  
          char operator;
    	  double number1, number2, number3, number4, result;
    	  
    	 Scanner prvi = new Scanner (System.in);
    	 
    	 System.out.println("Choose an operator: +,-,* or /");
    	 operator = prvi.next().charAt(0);
    	 
    	 System.out.println("Enter first num");
    	 number1 = prvi.nextDouble();
    	 
    	 System.out.println("Enter second num");
    	 number2 = prvi.nextDouble();
    	 
    	 System.out.println("Enter third num");
    	 number3 = prvi.nextDouble();
    	 
    	 System.out.println("Enter fourth num");
    	 number4 = prvi.nextDouble();
    	 
    	 switch (operator) {

         case '+':
           result = number1 + number2 + number3 + number4 ;
           System.out.println(number1 + " + " + number2 + " + " + number3 + " + " + number4 + " = " + result);
           break;

         case '-':
           result = number1 - number2 - number3 - number4;
           System.out.println(number1 + " - " + number2 + " - " + number3 + " - " + number4 + " = " + result);
           break;

         case '*':
           result = number1 * number2 * number3 * number4;
           System.out.println(number1 + " * " + number2 + " * " + number3 + " * " + number4 + " = " + result);
           break;

         case '/':
           result = number1 / number2 / number3 / number4;
           System.out.println(number1 + " / " + number2 + " / " + number3 + " / " + number4  + " = " + result);
           break;

         default:
           System.out.println("Invalid operator!");
           break;
       } 	 
    	 
    	prvi.close();
    	 
      }
}
