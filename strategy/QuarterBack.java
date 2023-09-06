package strategy;

public class QuarterBack extends Player {
    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        this.setDefenseBehavior();
        this.setOffenseBehavior();
    }

    public void setDefenseBehavior() {
        defenseBehavior = null;
    }
 /**
 * offenseBehavior randomly picks between RunBehavior and PassBehavior
 */ 
    public void setOffenseBehavior() {
        int choice = (int) (Math.random() * 2);
        if (choice == 0)
            offenseBehavior = new RunBehavior();
        else
            offenseBehavior = new PassBehavior();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
