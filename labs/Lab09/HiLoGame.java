import java.io.*;

public class HiLoGame  {
	public static void main ( String[] args) throws IOException {
	
		BufferedReader br;
		br = new BufferedReader( new InputStreamReader ( System.in) );
		
		
		System.out.println("This is a high-low guessing game.  The computer will pick a number between /n" +
								 "0 and  100 The number that is chosen will determine the number of guesses /n" +
								 "that are given.");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.print("Would you like to play? Enter YES or NO: ");
		String playYesOrNo = br.readLine();
		System.out.println();
		System.out.println();
		
		int guessNum = 1;
		
		while (playYesOrNo.equalsIgnoreCase("yes") && guessNum > 0) {	
			int go = 1;
			int times = 1;
			int secretNum = (int) (Math.random() * 100.0);
			while (go == 1) {
				System.out.print("Enter a guess: ");
				String guess = br.readLine();
				guessNum = Integer.parseInt(guess);
				
				if (guessNum != secretNum && times < 6) {
					int guessesLeft = 6 - times;
				
					System.out.println();
					System.out.println("You got it wrong!  You have " + guessesLeft + " guesses left." );
					
					if (secretNum > guessNum) {
						System.out.println("Your guess was too low");
						}
					else System.out.println("Your guess was too high");
					
					System.out.println();
					times++;
					}
			
				else if (guessNum == secretNum) {
					System.out.println();
					System.out.println("You win!");
					System.out.println();
					System.out.println();
					go = 0;
					}
				else {
					System.out.println();				
					System.out.println("Sorry, You loose! :-(");
					System.out.println("But if it makes you feel better your secret number was " + secretNum);
					System.out.println();
					System.out.println();
					go = 0;
					}
				}
			System.out.println();
			System.out.println();
			System.out.println("Do you want to play again?");
			System.out.print("Enter YES or NO: ");
			playYesOrNo = br.readLine();
			System.out.println();
			}
		
		
		
		System.exit(0);
		}
	}