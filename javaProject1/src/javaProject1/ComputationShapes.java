package javaProject1;

import java.util.Scanner;

public class ComputationShapes {

	  public static void main(String args[]) {
	        
	        Scanner in = new Scanner(System.in);
	        
	        System.out.println("\"C\" for Circle");
	        System.out.println("\"S\" for Square");
	        System.out.println("\"R\" for Rectangle");
	        System.out.println("\"T\" for Triangle");
	        System.out.print("Enter your choice: ");
	        char choice = in.next().charAt(0);
	        
	        switch(choice) {
	            case 'C':
	                System.out.print("Enter Radius of Circle: ");
	                double r = in.nextDouble();
	                double ac =(r*r)*Math.PI;
	                System.out.println("Area of Circle = " + ac);
	                break;
	                
	            case 'S':
	                System.out.print("Enter Side of Square: ");
	                double side = in.nextDouble();
	                double as = side * side;
	                System.out.println("Area of Square = " + as);
	                break;
	                
	            case 'R':
	                System.out.print("Enter Length of Rectangle: ");
	                double l = in.nextDouble();
	                System.out.print("Enter Width of Rectangle: ");
	                double w = in.nextDouble();
	                double ar = l * w;
	                System.out.println("Area of Rectangle = " + ar);
	                break;
	                
	            case 'T':
	                System.out.print("Enter Base of Triangle: ");
	                double b = in.nextDouble();
	                System.out.print("Enter Height of Triangle: ");
	                double h = in.nextDouble();
	                double at = ( b*h) / 2 ;  
	                System.out.println("Area of Triangle = " + at);
	                break;
	                
	            default:
	                System.out.println("Invalid choice!");
	        }
	    }
	}

