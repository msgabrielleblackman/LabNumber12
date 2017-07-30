import java.util.Scanner;

public class RoshamboApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RandomPlayer random = new RandomPlayer();
        char quit = ' ';

        while (quit != 'N') {
            {
                random.play();

                System.out.println("Play again ? Press any key to continue, or 'N' to quit");
                quit = input.nextLine().toUpperCase().charAt(0);
            }
            input.close();
            random.displayStats();
        }
    }
}