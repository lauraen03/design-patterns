/* Written by Laura Nolan */
package observer;


/**
 * Represents a display for displaying the score of a hole for a Golfer.
 */
public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Constructs a HoleScoreDisplay for a Golfer and registers it as an observer.
     *
     * @param golfer The Golfer to observe.
     */
    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    @Override
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
    }

    @Override
    public String toString() {
        return "Current Hole stats: Par (" + par + ") Strokes (" + strokes + "), " + (strokes - par) + " over par";
    }
}
