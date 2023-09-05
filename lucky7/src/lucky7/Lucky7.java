package lucky7;
import java.util.Random;
import java.util.Scanner;

public class Lucky7 {

	public static void main(String[] args) {
		// Lucky 7 
		
		Random random = new Random();
		Scanner userInput = new Scanner(System.in);
		
		// Set the start money  
		System.out.printf("Input your start money: ");
		System.out.printf("\n");
		int startMoney = userInput.nextInt();
		
		// Mark the round number  
		int roundNumber = 0;
		
		// Set a mark about "continue"  
		boolean nextRound = true;
		
		while (nextRound)
		{
			if (startMoney < 1)
			{
				System.out.printf("You lost...\n");
				break;
			}
			// target number is 7, mark the occurrence of it
			int occurrence = 0;

			int[] numbers = new int[3];
			
			for (int i = 0; i < 3; i++)
			{
				numbers[i] = random.nextInt(10) + 1;
				System.out.printf("%d ", numbers[i]);
				if (numbers[i] == 7)
				{
					occurrence++;
				}
			}
			System.out.printf("\n"); 
			System.out.printf("Occurrences of 7: %d\n", occurrence);
			
			
			startMoney--;
			if (occurrence == 1)
			{
				startMoney = startMoney + 3;
			}
			else if (occurrence == 2)
			{
				startMoney = startMoney + 5;
			}
			else if (occurrence == 3)
			{
				startMoney = startMoney + 10;
			}
			
			roundNumber++;
			// Round info  
			System.out.printf("Round %d, You won: %d\n", roundNumber, startMoney);
			
			
			System.out.printf("Continue? Enter 'y' or 'n'\n");
			String ifContinue = userInput.next();
			if (ifContinue.equals("y"))
			{
				continue;
			}
			else if (ifContinue.equals("n"))
			{	
				System.out.printf("See you next time!\n");
				break;
			}
		}
		

		
	}

}
