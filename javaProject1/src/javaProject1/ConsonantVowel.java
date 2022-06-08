package javaProject1;

import javax.swing.JOptionPane;

public class ConsonantVowel {

	String word ="";
	String cWord = "";
	String vWord = "";
	int numOfConsonants = 0;
	int numOfVowels = 0;
	int i= 0;
	word = JOptionPane.showInputDialog("Input a string");
	
	  while (i<word.length()) {
		  switch(word.charAt(i))  {
		    case 'a':
		    case 'A':
		    case 'e':
		    case 'E':
		    case 'i':
		    case 'I':
		    case 'o':
		    case 'O':
		    case 'u':
		    case 'U':
		    	
		  vWord = vWord + word.charAt(i);
		  numOfVowels++;
		  break;
		  
		  default:
			  cWord = cWord + word.charAt(i);
			  numOfConsonants++;
		  }
		  i++;
	  }
  System.out.println("The word is: "+word);
  System.out.println("Consonant String: "+cWord);
  System.out.println("Vowel String: "+vWord);
  System.out.println("Number of vowels: "+numOfVowels);
  System.out.println("Number of consonants: "+numOfConsonants);

}

}
