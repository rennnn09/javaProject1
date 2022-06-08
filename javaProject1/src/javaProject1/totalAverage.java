package javaProject1;

import java.util.Scanner;

public class totalAverage {


	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter 1st grade: ");
	        double grade1 = scan.nextDouble();
	        System.out.print("Enter 2nd grade: ");
	        double grade2 = scan.nextDouble();
	        System.out.print("Enter 3rd grade: ");
	        double grade3 = scan.nextDouble();
	        scan.close();
	        System.out.println("Average of 3 grades: " + getAverage(grade1, grade2, grade3));
	    }

	  public static double getAverage(double a, double b, double c)
	    {
	        return (a + b + c) / 3;
	    }
	}

