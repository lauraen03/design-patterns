package strategy;
/**
 * Initizialing variables
 */
public class Player {
    protected String firstName;
    protected String lastName;
    protected boolean offense;
    protected OffenseBehavior offenseBehavior;
    protected DefenseBehavior defenseBehavior;

    public Player(String firstName, String lastName, boolean offense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
    }
 /**
 * Setting defenseBehavior to null
 */   
    public void setDefenseBehavior() {
		this.defenseBehavior = null;
	}
 /**
 * Setting offenseBehavior to null
 */ 
    public void setOffenseBehavior(){
        this.offenseBehavior=null;
    }
    
    public String play() {
		if(this.offense) {
			if (this.defenseBehavior==null)
				return "not playing";
			else
				return this.defenseBehavior.play();
		}
		else {
			if (this.offenseBehavior==null)
				return "not playing";
			else
				return this.offenseBehavior.play();
		}
	}
   /**
 * Turnover method
 */ 
    public void turnover() {
		this.offense = true;
	}
  
   

}
