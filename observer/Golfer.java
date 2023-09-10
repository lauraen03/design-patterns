/* Written by Laura Nolan */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Golfer who can enter their golf scores and receive their game stats
 */
public class Golfer implements Subject {
    private String name;
    private List<Observer> observers;
    private int totalStrokes;
    private int totalPar;

    /**
     * Constructs a Golfer with the given name.
     *
     * @param name The name of the Golfer.
     */
    public Golfer(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int strokes, int par) {
        for (Observer observer : observers) {
            observer.update(strokes, par);
        }
    }

    /**
     * Enters the golf scores for a hole and notifies observers
     *
     * @param strokes The number of strokes taken by the golfer.
     * @param par     The par value for the hole.
     */
    public void enterScore(int strokes, int par) {
        totalStrokes += strokes;
        totalPar += par;
        notifyObservers(strokes, par);
    }

    /**
     * Gets the name of the Golfer.
     *
     * @return The name of the Golfer.
     */
    public String getName() {
        return name;
    }
}
