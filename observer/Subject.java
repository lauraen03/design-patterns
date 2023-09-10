/* Written by Laura Nolan */
package observer;

/**
 * Represents a subject that observers can register with to receive updates.
 */
public interface Subject {
    /**
     * Registers an observer to receive updates.
     *
     * @param observer The observer to register.
     */
    void registerObserver(Observer observer);

    /**
     * Removes an observer from receiving updates.
     *
     * @param observer The observer to remove.
     */
    void removeObserver(Observer observer);

    /**
     * Notifies all registered observers with the number of strokes and par value for a hole.
     *
     * @param strokes The number of strokes the golfer has taken
     * @param par     The par value for the hole.
     */
    void notifyObservers(int strokes, int par);
}
