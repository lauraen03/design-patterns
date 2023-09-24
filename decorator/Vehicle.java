// Laura Nolan CSCE247
package decorator;

import java.util.ArrayList;

/**
 * Interface for representing a Vehicle.
 */
public interface Vehicle {
    ArrayList<String> getLines();
    
    /**
     * Constructor for initializing a Vehicle with lines.
     * @param lines The lines representing the vehicle.
     */
    public void Vehicle(ArrayList<String> lines);

    /**
     * Get a string representation of the Vehicle.
     * @return A string representing the vehicle.
     */
    public String toString();
}
