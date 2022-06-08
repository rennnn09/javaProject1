package javaProject1;
import java.util.Scanner;

public class PinCode {

	public static void main(String[] args) {
		int attemps = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter PIN Code: ");
		String PUK = null;
		String PIN = null;
		String CORRECT_PIN = "1234";
		String CORRECT_PUK = "0123";
		do{
		        PIN  = keyboard.next();
		        attemps++;
		        if (!PIN.equals(CORRECT_PIN) && attemps < 1) 
		            { 
		               System.out.println("PIN is incorrect! Try again!" );
		            }
		     }while(!PIN.equals(CORRECT_PIN) && attemps < 1);
		            if (PIN.equals(CORRECT_PIN) && attemps <= 3) {  
		                System.out.println("Welcome to Smart....Simply Amazing");  
		            }
		             else {
		               System.out.println("Invalid PIN Code! Try again with PUK");
		               attemps = 0;
		            do{
		                PUK  = keyboard.next();
		                attemps++;
		                if (!PUK.equals(CORRECT_PUK) && attemps < 1) 
		                    { 
		                       System.out.println("PIN is incorrect! Try again!" );
		                    }
		             }while(!PUK.equals(CORRECT_PUK) && attemps < 1);
		            if (PUK.equals(CORRECT_PUK) && attemps <= 3) {  
		                System.out.println("Welcome to Smart....Simply Amazing");  
		            }
		            else {
			               System.out.println("Invalid PUK Code!");
			               attemps = 0;
		            }
		            }
}
}

