package singleton;

import java.util.Scanner;
    /**
    * The UI class handles the user interface and game interaction.
    */
public class UI {
    private Scanner reader;
    private static final String YES = "y";
    private static final String NO = "n";
    /**
     * Constructor to initialize the UI and create a Scanner for input.
     */
    public UI() {
        reader = new Scanner(System.in);
    }
    /**
     * Start the Anagram Game.
     */
    public void run() {
        Game game = Game.getInstance();
        clear();
        System.out.println("Welcome to our Anagram Game!");
        
        game.setLevel(Difficulty.EASY);
        while (true) {
        
            System.out.print("Enter an Anagram of the following '" + game.getQuestion() + "': ");
            String userAnswer = reader.nextLine().trim().toLowerCase();

            if (game.isCorrect(userAnswer)) {
                System.out.println("Yay! You got it.");
            } else {
                System.out.println("Sorry, that is not a valid anagram");
            }

            if (!playAgain())
                break;
            clear();
        }

        System.out.println("Your final score is " + game.getScore());
        System.out.println("Have a nice day");
    }
    /**
     * Ask the user if they want to play the game again.
     *
     * @return True if the user wants to play again, false otherwise.
     */
    public boolean playAgain() {
        while (true) {
            System.out.println("Would you like to continue (Y)es or (N)o: ");

            String result = reader.nextLine().trim();

            if (result.equalsIgnoreCase(YES)) {
                return true;
            } else if (result.equalsIgnoreCase(NO)) {
                return false;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
    /**
     * Clear the console screen.
     */
    public void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    /**
     * The main method to start the Anagram Game.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        UI ui = new UI();
        ui.run();
    }
}