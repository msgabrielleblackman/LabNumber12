
public class RandomPlayer extends Player {
    private Player TheSharks;
    private HumanPlayer TheJets;
    private CHOICES playersChoice;
    private CHOICES computerChoice;
    private RESULT result;
    private static int wins;
    private static int loses;
    private static int draws;


    public RandomPlayer() {
        super();
        TheSharks= new Player();
        TheJets = new HumanPlayer();
    }

    public void play() {
        playersChoice = TheSharks.getChoice();
        computerChoice = TheJets.getChoice();
        result = getResults();
        displayResults();
        stats();
    }

    public void displayStats()
    {
        System.out.println(" You have played " + (wins + loses + draws));
        System.out.println(" You have won " + wins + "times");
        System.out.println(" You have lost" + loses+ "loses");
        System.out.println(" You have tied " + draws + "draws. \n GOODBYE !");
    }

    private void stats()
    {
        if (result == RESULT.WIN)
            wins++;
        else if (result == RESULT.LOSE)
            loses++;
        else draws++;


    }

    private void displayResults() {
        switch (result) {
            case WIN:
                System.out.println(playersChoice + " beats " + computerChoice + " The Shark Wins !");
                break;
            case LOSE:
                System.out.println(playersChoice + " loses to " + computerChoice + " The Jets Loses");
                break;
            case DRAW:
                System.out.println(playersChoice + " equals to " + computerChoice + ". Its a draw !");
                break;
        }

    }

   private RESULT getResults()
    {
        if (playersChoice==computerChoice)
            return RESULT.DRAW;
        switch (playersChoice){
            case ROCK:
                return (computerChoice == CHOICES.SCISSORS ?RESULT.WIN : RESULT.LOSE );
            case PAPER:
                return (computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
            case SCISSORS:
                return (computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);

        }

        // This line will not get used
        return RESULT.LOSE;
    }
}
