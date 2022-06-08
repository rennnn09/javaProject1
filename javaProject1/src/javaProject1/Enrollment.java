package javaProject1;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Enrollment {

	public static void main(String[] args){
		
		
		BufferedReader reader = new BufferedReader( new 
					InputStreamReader( System.in));
		
		String name = null;
		int code = 0;
		int units = 0;
		double tuition = 0;
		int price;
		
		try{			
			System.out.print("Enter your Name: ");
		    name =(reader.readLine());

		    System.out.println("Course Code: ");
		    System.out.println("1 BSIT" + "\n2 BSCPE");
		    System.out.print("Enter Course Code [1/2]: ");
			code = Integer.parseInt(reader.readLine());

			System.out.print("Enter Number of Units Enrolled: ");
			units = Integer.parseInt(reader.readLine());

		}
    catch( Exception e){
			System.out.println("Input is invalid. Try again.");	
			System.exit(0);
		}
	
		
		System.out.print("\nName: "+name);
			if(code == 1) {	
		    	 price = 450;
		    	 System.out.print("\nCourse: BSIT");
		    	 tuition = (units * 450);}
		    else {
		    	 price = 420;
	    	     System.out.print("\nCourse: BSCPE");
	             tuition = (units * 420);}
	    
	    System.out.print("\nTuition Fee: "+ tuition);
		
	}
}
