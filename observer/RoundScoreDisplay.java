/* Written by Laura Nolan */
package observer;

/**
 * Represents a display for displaying the round score for a Golfer.
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * Constructs a RoundScoreDisplay for a Golfer and registers it as an observer.
     *
     * @param golfer The Golfer to observe.
     */
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    @Override
    public void update(int strokes, int par) {
        strokesTotal += strokes;
        parTotal += par;
    }

    @Override
    public String toString() {
        String result = "Overall stats: Par (" + parTotal + ") Strokes (" + strokesTotal + "), ";
        if (strokesTotal < parTotal) {
            result += "Under par";
        } else if (strokesTotal == parTotal) {
            result += "Making par";
        } else {
            result += (strokesTotal - parTotal) + " over par";
        }
        return result;
    }
}
