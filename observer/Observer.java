/* Written by Laura Nolan */
package observer;

/**
 * Represents an observer that receives updates about golf scores.
 */
public interface Observer {
    /**
     * Updates the observer with the number of strokes and par value for a hole.
     *
     * @param strokes The number of strokes taken by the golfer.
     * @param par     The par value for the hole.
     */
    void update(int strokes, int par);

    /**
     * Converts the observer's information to a string.
     *
     * @return The observer's information represented as a string
     */
    String toString();
}
