package javaProject1;

import java.io.*;

import javax.swing.JOptionPane;

public class AverageDiscount {

	 public static void main(String[] args) {
		  
		    double A, TTF,TF,Total; 
		    String SN,discount;
		    
		    SN=JOptionPane.showInputDialog(null, "Student Name: ");
		    A =Double.parseDouble(JOptionPane.showInputDialog(null,"Average: "));
		    TF =Double.parseDouble(JOptionPane.showInputDialog(null,"Tuition Fee: "));
		    
		    if(A >=95 && A <=100)
		    { 
		        TTF = TF*1;
		        discount = " 100% Discount" ;
		    }
		    else if(A >=90 && A <=94)
		     { 
		        TTF = TF*.25;
		        discount = " 25% Discount" ;
		    }  
		    else if(A >=85 && A <=89)
		     { 
		        TTF = TF*.10;
		        discount = " 10% Discount" ;
		    }   
		    else 
		     { 
		        TTF = 0;
		        discount = " No Discount" ;
		    }   
		    Total= TF-TTF;
		    discount = "Student Name: " + SN + "\nAverage: "+ A + "\nTuition Fee: " +TF+" \nDiscount : " +discount+"\nTotal Tuition Fee: " +Total; 
		    JOptionPane.showMessageDialog(null,discount); 
		        
		    }
		    
		}
