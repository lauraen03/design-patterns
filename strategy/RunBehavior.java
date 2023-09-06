package strategy;
public class RunBehavior implements OffenseBehavior {

	@Override
	public String play() {
		String[] moves = {"drive(up the gut)", "draw", "pitch", "reverse"};
		int choice = (int)Math.random()*4;
		return "runs a " + moves[choice];	
    }

}