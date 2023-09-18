//Laura Nolan CSCE247
package decorator;

import java.util.ArrayList;

/**
 * Concrete Vehicle class representing a car.
 */
public class Car implements Vehicle {
    private ArrayList<String> lines;

    /**
     * Constructor for the Car class.
     */
    public Car() {
        this.lines = FileReader.getLines("decorator/TXT/car.txt");
    }

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
}

