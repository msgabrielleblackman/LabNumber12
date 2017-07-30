import java.util.Random;

        public class HumanPlayer extends Roshambo {

            private Random rand;

            public HumanPlayer() {
                super();
                rand = new Random();
            }
                public CHOICES getChoice() {
                int choice = 1 + rand.nextInt(3);

                switch (choice){

                    case 1:
                        return CHOICES.ROCK;
                    case 2:
                        return CHOICES.PAPER;
                }

                //case 3:
                    return CHOICES.SCISSORS;




            }
        }