// Laura Nolan CSCE247
package decorator;

import java.util.ArrayList;

/**
 * Vehicle class representing a car.
 */
public class Car implements Vehicle {
    private ArrayList<String> lines;

    /**
     * Constructor for the Car class.
     */
    public Car() {
        this.lines = lines;
    }

    /**
     * 
     */
    
    @Override
    public ArrayList<String> getLines() {
        return lines;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String line : lines) {
            result.append(line).append("\n");
        }
        return result.toString();
    }

    @Override
    public void Vehicle(ArrayList<String> lines) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Vehicle'");
    }
}
