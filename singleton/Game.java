//Laura Nolan
package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
    /**
    * The Game class- represents the Anagram game.
    * Controls the current question,
    * score, and difficulty level.
    */
public class Game {
    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private int score;
    /**
     * Constructor
     * Initializes the game state and loads anagrams.
     */
    private Game() {
        rand = new Random();
        anagrams = new HashMap<>();
        score = 0;
        loadAnagrams();
    }
    /**
     * Get the instance of the Game class.
     *
     * @return The Game instance.
     */
    public static Game getInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }

    private void loadAnagrams() {
        for (Difficulty difficulty : Difficulty.values()) {
            ArrayList<Anagram> anagramList = FileReader.getAnagrams(difficulty);
            anagrams.put(difficulty, anagramList);
        }
    }
    /**
     * Get the current anagram question.
     *
     * @return The anagram question as a String.
     */
    public String getQuestion() {
        if (currentAnagram == null) {
            generateRandomAnagram();
        }
        return currentAnagram.getQuestion();
    }

    private Anagram currentAnagram;
    /**
     * Generates a random anagram from the current list of
    * anagrams and sets it as the current anagram for the game.
    * If there are no anagrams available for the current difficulty level, a message will be displayed.
    */
    private void generateRandomAnagram() {
        ArrayList<Anagram> anagramList = anagrams.get(level);
        if (anagramList != null && !anagramList.isEmpty()) {
            int randomIndex = rand.nextInt(anagramList.size());
            currentAnagram = anagramList.get(randomIndex);
        } else {
            currentAnagram = new Anagram("No anagrams available for this difficulty.", new ArrayList<>());
        }
    }
    /**
     * Check if the user's answer is correct for the current anagram.
     *
     * @param userAnswer The user's answer as a String.
     * @return If the answer is correct-true. If incorrect-false.
     */
    public boolean isCorrect(String userAnswer) {
        if (currentAnagram == null) {
            return false;
        }
        return currentAnagram.isCorrect(userAnswer);
    }
    /**
     * Get the current score of the game.
     *
     * @return The score as an integer.
     */
    public int getScore() {
        return score;
    }
    /**
    * Set the difficulty level for the game. 
    *
    * @param level The difficulty level as a Difficulty enum.
    */
    public void setLevel(Difficulty level) {
        this.level = level;
        currentAnagram = null;
    }
}
