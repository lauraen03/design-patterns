//Laura Nolan
package singleton;

import java.util.ArrayList;
/**
 * The Anagram class represents an anagram question and its possible answers.
 */
public class Anagram {
    private String question;
    private ArrayList<String> answers;
    /**
     * Constructor to create an Anagram object with a question and answers.
     *
     * @param question The anagram question as a String.
     * @param answers  The list of possible answers as an ArrayList of Strings.
     */
    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }
    /**
     * Get the anagram question.
     *
     * @return The anagram question as a String.
     */
    public String getQuestion() {
        return question;
    }
    /**
     * Check if the user's answer is correct for this anagram.
     *
     * @param userAnswer The user's answer as a String.
     * @return If the answer is correct-true. If incorrect-false.
     */
    public boolean isCorrect(String userAnswer) {
        return answers.contains(userAnswer);
    }
}
