import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		int playerScore = 0;
		int computerScore = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 0; playerScore < 2 && computerScore < 2; i++) {

			int computerChoice = (int)(Math.random() * 3);
			String computerChoiceName = "";
			System.out.println("Computer made its decision");

			System.out.println("0 - Scissors, 1 - Paper, 2 - Rock");

			int playerChoice = input.nextInt();

			switch (computerChoice) {
				case 0: computerChoiceName = "Scissors";
					break;
				case 1: computerChoiceName = "Paper";
					break;
				case 2: computerChoiceName = "Rock";
					break;
			}

			System.out.println("computer's choice is - " + computerChoiceName + " - " + computerChoice);

			if (computerChoice == 1 && playerChoice == 0) {
				computerScore++;
				System.out.println("Computer scored!\n");
			}
			else if (playerChoice == 1 && computerChoice == 0) {
				playerScore++;
				System.out.println("Player scored!\n");
			}

			if (computerChoice - playerChoice == 1) {
				playerScore++;
				System.out.println("Player scored!\n");
			}
			else if (playerChoice - computerChoice == 1) {
				computerScore++;
				System.out.println("Computer scored!\n");
			}

			if (computerChoice - playerChoice == 2) {
				computerScore++;
				System.out.println("Computer scored!\n");
			}
			else if (playerChoice - computerChoice == 2) {
				playerScore++;
				System.out.println("Player scored!\n");
			}

			if (computerChoice - playerChoice == 0) {
				System.out.println("No one scored!\n");
			}
		}
	}
}
