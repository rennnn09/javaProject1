package javaProject1;
import java.util.Random;
import java.util.Scanner;

public class lottery {

	public static void main(String[] args) {
        Random ticket = new Random();
        int[] lotto = new int[6];
        int num;
        for (int i = 0; i < 6; i++) {
            num = (int) (Math.random() * 42);
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    num = (int) (Math.random() * 42);}}
            lotto[i] = num;
        }
        int count = winningNum(lotto);
        System.out.println("\nThe lottery numbers:");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");}
        	System.out.print("\n~~~~~~~~~~~~~~~~~~");
        System.out.println("\nWinning numbers you got: " + count);
        if (count == 3) {
            System.out.println("\nYou win P20.00!");
        } else if (count == 4) {
            System.out.println("\nYou win P1,000.00!");}
          else if (count == 5) {
            System.out.println("\nYou win P25,000.00!");}
          else if (count == 6) {
              System.out.println("\nYou win minimum Jackpot prize of P9 Million!");}
          else {
        	  System.out.print("\nBetter luck next time.");}
          }
 
    public static int winningNum(int[] lotto) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int[] user = new int[6];
        
        for (int i = 0; i < user.length; i++) {
            System.out.print("\nEnter lottery number: ");
            user[i] = scan.nextInt();
            if (user[i] > 0) {
            for (int j = 0; j < lotto.length; j++) {
                if (user[i] == lotto[j])
                	count++;} }
            else
            	System.out.print("Please enter 1-42.");
            	
          
        }
        return count;
    }
}
