package decorator;

import java.util.ArrayList;

/**
 * Decorator for changing the color of the vehicle.
 */
public class Paint extends VehicleDecorator {
    private String colorCode;

    /**
     * Constructor for the Paint class.
     * @param vehicle The vehicle to be painted.
     * @param color The desired color for painting.
     */
    public Paint(Vehicle vehicle, String color) {
        super(vehicle);
        this.colorCode = getColorCode(color);
    }

    private String getColorCode(String color) {
        switch (color.toLowerCase()) {
            case "red":
                return "\u001B[31m";
            case "green":
                return "\u001B[32m";
            case "yellow":
                return "\u001B[33m";
            case "blue":
                return "\u001B[34m";
            case "purple":
                return "\u001B[35m";
            case "cyan":
                return "\u001B[36m";
            default:
                return "\u001B[0m"; 
        }
    }

    @Override
    public ArrayList<String> getLines() {
        ArrayList<String> lines = new ArrayList<>(decoratedVehicle.getLines());
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, colorCode + lines.get(i));
        }
        return lines;
    }

    @Override
    public void Vehicle(ArrayList<String> lines) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Vehicle'");
    }
}
