package javaProject1;

import java.util.Scanner;

public class ComputerShop {
 
	    public static Scanner input = new Scanner(System.in);
	    public static String purchase,add;
		private static double amount2,amount1,amount3,amount4,amount5;
		public static int price1,price2,price3,price4,price5;
		public static String desc1,desc2,desc3,desc4,desc5;
		public static int quantity1,quantity2,quantity3,quantity4,quantity5;
		
	    public static void menu(){
	    	
	    	System.out.println("");
	    	System.out.println("ZAZASABNO COMPUTER SHOP");
	 	    System.out.println("    Mandaluyong City");
	 	    System.out.println("");
	 	    System.out.println("  PRODUCT INFORMATION");
	 	    System.out.println("");
	 	    System.out.println("Code   Description   Unit Price");
	 	    System.out.println("A001   Mouse         100.00");
	 	    System.out.println("A002   Monitor       2,500.00");
	 	    System.out.println("A003   Keyboard      200.00");
	 	    System.out.println("A004   Flash disk    300.00");
	 	    System.out.println("A005   Hard disk     1,500.00");
	 	    System.out.println("--------------------------------");
	        System.out.print("Purchase item (y/n)?");
	        purchase = input.next();}
	  
	    public static void order(){
	    	String a = null,b = null,c = null,d = null,e = null;
  
 	 	    
 	 	  if(purchase.equalsIgnoreCase("y")){ 
 	 		System.out.println("");
	 	    System.out.println("");
	    	System.out.println("ZAZASABNO COMPUTER SHOP");
	 	    System.out.println("    Mandaluyong City");
	 	    System.out.println("");
	 	    System.out.println("   PURCHASE ORDER");
	 	    
	 	    select:
 	 		  
 	 		 for(int i=0; i<5; i++)  {
 	 		System.out.println("");
            System.out.print("Select product code:    ");
            String code = input.next();
           
                     
             if (code.equals("A001")) {
            	         
                        a = code;
                     	price1 = 100;
                     	desc1 = "Mouse";
                     	System.out.print("Enter quantity:         ");
             	        quantity1 =input.nextInt();
             	        amount1 = price1* quantity1;
             	        System.out.println("Amount: "+"                " + amount1);
             }
                       
                       
             else if (code.equals("A002")) {
                    	 b= code;
                       	 price2 = 2500;
                	     desc2 = "Monitor";
                	     System.out.print("Enter quantity:         ");
             	        quantity2 =input.nextInt();
             	        amount2 = price2* quantity2;
             	        System.out.println("Amount: "+"                " + amount2);
             }
                       
                       
             else if (code.equals("A003")) {
            	        c= code;
                	    price3 = 200;
                	    desc3 = "Keyboard";
                	    System.out.print("Enter quantity:         ");
             	        quantity3 =input.nextInt();
             	        amount3 = price3* quantity3;
             	        System.out.println("Amount: "+"                " + amount3);
             }
                       
                       
             else if (code.equals("A004")) {
            	        d= code;
                	     price4 = 300;
                      	 desc4 = "Flash disk";
                      	 System.out.print("Enter quantity:         ");
             	        quantity4 =input.nextInt();
             	        amount4 = price4* quantity4;
             	        System.out.println("Amount: "+"                " + amount4);
             }
                       
                       
             else if (code.equals("A005")) {
            	         e= code;
                	     price5 = 1500;
                	     desc5 = "Hard disk";
                	     System.out.print("Enter quantity:         ");
             	         quantity5 =input.nextInt();
             	         amount5 = price5* quantity5;
             	         System.out.println("Amount: "+"                " + amount5);
             }
             else {
            	 System.out.println("Invalid Code.");
             }
                              
             System.out.print("Add item (y/n)?         ");
 	        add = input.next();
 	        if(add.equalsIgnoreCase("Y")) {
 				continue select;} 
 	        else {
 	        	
 		 	    System.out.println("");
 		 	    System.out.println("");
 		    	System.out.println("\t\tZAZASABNO COMPUTER SHOP");
 	 	 	    System.out.println("\t\t   Mandaluyong City");
 	 	 	    System.out.println("");
 	 	 	    System.out.println("\t\t   ORDER INFORMATION");
 	 	 	    System.out.println("");
 		 	    System.out.println("Code   Description   Unit Price   Quantity   Amount");
 		 	    System.out.println((a == null) ? "" : a+"   "+desc1 +"\t     "+price1 +"\t  "+quantity1+"\t     "+amount1);
 		 	    System.out.println((b == null) ? "" : b+"   "+desc2 +"\t     "+price2 +"\t  "+quantity2+"\t     "+amount2);
 		 	    System.out.println((c == null) ? "" : c+"   "+desc3 +"\t     "+price3 +"\t  "+quantity3+"\t     "+amount3);
 		 	    System.out.println((d == null) ? "" : d+"   "+desc4 +"\t     "+price4 +"\t  "+quantity4+"\t     "+amount4);
 		     	System.out.println((e == null) ? "" : e+"   "+desc5 +"     "+price5 +"\t  "+quantity5+"\t     "+amount5);
 		 	    System.out.println("-------------------nothing follows------------------"); 
 		 	    System.out.println("");
 	            
 		 	   double tAmount = amount1 + amount2 +amount3 + amount4 + amount5;
 		 	    System.out.println("\t\t\t\tGRAND TOTAL:" + tAmount);
 		 	    System.out.println("----------------------------------------------------");
 		 	    System.out.println("");
 		 	    

 		 	   System.out.print("New Customer (y/n)?");
 		 	   String NCustomer = input.next();
 		 	    if (NCustomer.equalsIgnoreCase("Y")) {
 		 	    	ComputerShop again = null;
 		 	    	ComputerShop.menu();}
 		 	    else { 
 		 	    	System.out.println("");
 		 	    	System.out.println("Thank you for purchasing!");
 		 	    } }
   
	        }
 	 	  
	        System.out.println("");
	        System.out.println("OUT OF PRODUCTS");}
 	 	  else {
 	 		System.out.println("Thank you!");
 	 	  }
      }
 	 	

	    public static void main(String[] args) {
	       menu();
	       order();
	    }
}
