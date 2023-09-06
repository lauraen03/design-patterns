package strategy;

public class Receiver extends Player {

    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        this.setDefenseBehavior();
        this.setOffenseBehavior();
    }

    /**
     *  setting DefenseBehavior
     */
    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        this.defenseBehavior = null;
    }

    /**
     *  setting OffenseBehavior to ReceiverBehavior
     */
    public void setOffenseBehavior() {
        this.offenseBehavior = new ReceiverBehavior();
    }

/**
 * toString method to return the player's name
 */ 
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
