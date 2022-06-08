package javaProject1;
import java.util.Scanner;

public class Keypad {
	public static void main (String args[]) {
		String tel = "0123456789";
			char letter;
			Scanner in = new Scanner(System.in);
			System.out.print("Enter a letter: ");
			letter = in.next().toLowerCase().charAt(0);
			if (letter >= 'a' && letter <= 'c' )
			{
				System.out.println("Telephone Digit: "+tel.indexOf('2'));
			}
			else if (letter >= 'd' && letter <= 'f' )
			{
				System.out.println("Telephone Digit: "+tel.indexOf('3'));
			}
			else if (letter >= 'g' && letter <= 'i' )
			{
				System.out.println("Telephone Digit: "+tel.indexOf('4'));
			}
			else if (letter >= 'j' && letter <= 'l' )
			{
				System.out.println("Telephone Digit: "+tel.indexOf('5'));
			}
			else if (letter >= 'm' && letter <= 'o' )
			{
				System.out.println("Telephone Digit: "+tel.indexOf('6'));
			}
			else if (letter >= 'p' && letter <= 's' )
			{
				System.out.println("Telephone Digit: "+tel.indexOf('7'));
			}
			else if (letter >= 't' && letter <= 'v' )
			{
				System.out.println("Telephone Digit: "+tel.indexOf('8'));
			}
			else if (letter >= 'w' && letter <= 'z' )
			{
				System.out.println("Telephone Digit: "+tel.indexOf('9'));
			}
			else
			{
				System.out.println("Invalid Letter!");
			}
	}
}
