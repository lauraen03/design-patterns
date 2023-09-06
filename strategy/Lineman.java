package strategy;

public class Lineman extends Player {
    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        this.setDefenseBehavior();
        this.setOffenseBehavior();
    }
 /**
 *defenseBehavior randomly picks between BlockBehavior, StripBehavior, and SackBehavior
 */ 
    public void setDefenseBehavior() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0)
            defenseBehavior = new BlockBehavior();
        else if (choice == 1)
            defenseBehavior = new StripBehavior();
        else
            defenseBehavior = new SackBehavior();
    }

    public void setOffenseBehavior() {
        this.offenseBehavior = new OBlockBehavior();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
