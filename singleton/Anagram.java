package singleton;

import java.util.ArrayList;
/**
 * The Anagram class represents an anagram question and its possible answers.
 */
public class Anagram {
    private String question;
    private ArrayList<String> answers;

    public Anagram(String question, ArrayList<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isCorrect(String userAnswer) {
        return answers.contains(userAnswer);
    }
}
