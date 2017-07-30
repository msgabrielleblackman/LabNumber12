import java.util.Scanner;

public class Player extends HumanPlayer {

    Scanner input;

    public Player()
    {
        super();
        input = new Scanner(System.in);

        System.out.println(" Welcome to Rock, Paper, Scissors ! ");
        System.out.println();
        System.out.println("Enter your name Player 1: ");
        System.out.println();
        input.nextLine();

        System.out.println(" Would you like to play TheJets or TheSharks: ");
        String answer = "'j' or 's' ";
        input.nextLine();
    }


    public CHOICES getChoice(){
        System.out.println("Please enter your choice: R=ROCK, P=PAPER, S=SCISSORS");
        char playerChoice = input.nextLine().toUpperCase().charAt(0);

        switch (playerChoice)
        {
            case 'R':
                return CHOICES.ROCK;
            case 'P':
                return CHOICES.PAPER;
            case 'S':
                return CHOICES.SCISSORS;

        }
        System.out.println("Invalid input!");
        return getChoice();
}

}