
package numberGuessing;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
        System.out.println("How to play: ");
        System.out.println("Enter a lower bound and an upper bound.");
        System.out.println("The computer will generate a random number and you have 3 tries to guess it.");
        System.out.println("Good Luck!");
        System.out.println();
        System.out.println("Enter lower bound: ");
        int lower = scr.nextInt();
        
 
        
        System.out.println("Enter upper bound: ");
		int upper = scr.nextInt();
		
		while(upper <= lower) {
			 System.out.println("Choose a number higher than " + lower);
			 System.out.println("New upper bound is...");
				upper = scr.nextInt();
		}
		
	
		int random =  (int) (Math.random() * (upper - lower + 1) + lower) ;
		
		int guessCount = 0;
		boolean won = false;
		
		while(won == false && guessCount < 3) {
			System.out.println("Enter guess: ");
			int guess = scr.nextInt();
			guessCount++;
			
			while(guess < lower || guess > upper) {
				System.out.println("Please choose a number within the range " + lower + " and " + upper);
				guess = scr.nextInt(); 
			}
			
			if(guessCount >= 3 ) {
				
				System.out.println("LOSER");
				
			}
				else if(guess > random && guessCount < 3) {
					System.out.println("Guess a smaller number");
					
				}
				else if(guess < random && guessCount < 3) {
					System.out.println("Aim higher!");
					
				}
				else {
					won = true;
					System.out.println("You won!!");
					}
		}
		
	/*	if(!won) {
			System.out.println("LOSEERRRRRRR!!!!!!!!!!");
		}
	*/
		System.out.print("The random number was... " + random);
		
		scr.close();
		
	}
}
