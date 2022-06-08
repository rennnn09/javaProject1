package javaProject1;

import java.util.Scanner;

public class ReverseAdjective {
	public static void main(String[]args){
		String adjective = getWord();
	    char[] wordArray;
	    wordArray = adjective.toCharArray();
	    System.out.print("\nNormal Word: " + adjective + "\n");
	    String result= "";
	    for(int i=adjective.length(); i>0; i--) {
	        result+= adjective.charAt(i-1);
	    }  
	     System.out.print("Reverse Word: " + result);


	}

	public static String getWord(){
	    Scanner scan = new Scanner(System.in);
	    String word;
	    System.out.print("What do you feel today? ");
	    word = scan.nextLine();
	    return word;
	}
	}

