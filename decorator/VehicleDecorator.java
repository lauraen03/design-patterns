//Laura Nolan CSCE247
package decorator;

import java.util.ArrayList;

/**
 * Abstract class for implementing vehicle decorators.
 */
public abstract class VehicleDecorator implements Vehicle {
    protected Vehicle decoratedVehicle;

    
    /**
     * Constructor for the VehicleDecorator class.
     * @param vehicle The vehicle to be decorated.
     */

    public VehicleDecorator(Vehicle vehicle) {
        this.decoratedVehicle = vehicle;
    }

    @Override
    public ArrayList<String> getLines() {
        return decoratedVehicle.getLines();
    }
}
