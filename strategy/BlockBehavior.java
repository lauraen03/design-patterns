package strategy;

import java.util.Random;

public class BlockBehavior implements DefenseBehavior {

	public String play() {
		 String[] actions = {"kick", "punt", "pass", "catch"};

        // Create a Random object
        Random random = new Random();

        // Generate a random index within the array's bounds
        int randomIndex = random.nextInt(actions.length);

        // Get the randomly chosen action
        String chosenAction = actions[randomIndex];

        // Print the chosen action
        System.out.println(chosenAction);
        return chosenAction;
	}

}