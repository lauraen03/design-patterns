package strategy;
public class PassBehavior implements OffenseBehavior {

	public String play() {
		String[] moves = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
		int choice = (int)Math.random()*5;
		return "throws a " + moves[choice];
	}

}