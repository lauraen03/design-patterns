package strategy;

import java.util.Random;

public class BlockBehavior implements DefenseBehavior {

	public String play() {
		 String[] actions = {"kick", "punt", "pass", "catch"};

        
        Random random = new Random();

        
        int randomIndex = random.nextInt(actions.length);

        // Get the randomly chosen action
        String chosenAction = actions[randomIndex];

        // Print the chosen action
        System.out.println(chosenAction);
        return chosenAction;
	}

}