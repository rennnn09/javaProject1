package javaProject1;

import java.util.Scanner;
public class MathOperators {

		public static void main(String[] args) {
		   int result;
	    Scanner scan = new Scanner(System.in);
	      
	    try
	    {
	       System.out.print("Enter a number: ");
	       int number1 = Integer.parseInt(scan.nextLine());
	       
	       System.out.print("Enter a Mathematical Operator: ");
	       String MO = scan.next();
	      
	       System.out.print("Enter a number: ");
	       int number2 = scan.nextInt();
	          switch (MO) {
	          case "+":
	              result = number1 + number2;
	              System.out.println(number1 + " + " + number2 + " = " + result);
	              break;

	            case "-":
	              result = number1 - number2;
	              System.out.println(number1 + " - " + number2 + " = " + result);
	              break;

	            case "*":
	              result = number1 * number2;
	              System.out.println(number1 + " * " + number2 + " = " + result);
	              break;

	            case "/":
	              result = number1 / number2;
	              System.out.println(number1 + " / " + number2 + " = " + result);
	              break;
	          
	            case "%":
	                result = number1 % number2;
	                System.out.println(number1 + " % " + number2 + " = " + result);
	                break;
	          }
	       
	    }
	    catch (ArithmeticException ex)
	    { 
	    	System.out.println("Arithmetic Exception occurred.");
	    }
	    catch (NumberFormatException ex)
	    { 
	       System.out.println("Number Format Exception occurred.");
	    }
	 }
	}
