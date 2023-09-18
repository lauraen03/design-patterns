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

    /**
     * Integrate additional decorations into the vehicle.
     * @param decor The list of decoration lines to integrate.
     */
    public void integrateDecor(ArrayList<String> decor) {
        ArrayList<String> lines = decoratedVehicle.getLines();
        int maxSize = Math.max(lines.size(), decor.size());

        for (int i = 0; i < maxSize; i++) {
            String line = i < lines.size() ? lines.get(i) : "";
            String decoration = i < decor.size() ? decor.get(i) : "";
            lines.set(i, line + decoration);
        }
    }
}
