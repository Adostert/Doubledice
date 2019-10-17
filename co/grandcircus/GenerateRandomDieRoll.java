package co.grandcircus;
import java.util.Random;
import java.util.Scanner; 

public class GenerateRandomDieRoll {

	    public static void main(String[] args) {
	    	
	    	Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to Grand Circus Casion!");
			System.out.println("How many sides should your dice have?: ");
			int userInput = scan.nextInt();
			char userReply = 0;
		do {	
	      Random diceNumber = new Random();
	      int x = diceNumber.nextInt(userInput) + 1;
	        
	      System.out.println("Your first dice: " + x);
	      Random diceNumber2 = new Random();
	      int x2 = diceNumber2.nextInt(userInput) + 1;
	        
	      System.out.println("your second dice: " + x2);
		
		
			 System.out.println("Would you like to go again? (y/n) ");
			 
		        userReply = scan.next().charAt(0);
		        } while (userReply == 'y');
					if (userReply != 'y');
					System.out.println("Goodbye!");
}

}
