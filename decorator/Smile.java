//Laura Nolan CSCE247
package decorator;

import java.util.ArrayList;

/**
 * Concrete Decorator for adding a Smile to a vehicle.
 */
public class Smile extends VehicleDecorator {
    private ArrayList<String> smileLines;

    /**
     * Constructor for the Smile class.
     * @param vehicle The vehicle that has a smile added to it.
     */

    public Smile(Vehicle vehicle) {
        super(vehicle);
        this.smileLines = FileReader.getLines("decorator/TXT/smile.txt");
    }

    @Override
    public ArrayList<String> getLines() {
        ArrayList<String> decoratedLines = decoratedVehicle.getLines();
        ArrayList<String> combinedLines = new ArrayList<>();

        int maxLineCount = Math.max(decoratedLines.size(), smileLines.size());

        for (int i = 0; i < maxLineCount; i++) {
            String decoratedLine = i < decoratedLines.size() ? decoratedLines.get(i) : "";
            String smileLine = i < smileLines.size() ? smileLines.get(i) : "";

            String combinedLine = combineLines(decoratedLine, smileLine);
            combinedLines.add(combinedLine);
        }

        return combinedLines;
    }

    private String combineLines(String line1, String line2) {
        int maxLength = Math.max(line1.length(), line2.length());
        StringBuilder combinedLine = new StringBuilder(maxLength);

       
        int smileOffset = 2; 
        int rimsOffset = 7;   

        for (int i = 0; i < maxLength; i++) {
            char char1 = i < line1.length() ? line1.charAt(i) : ' ';
            char char2 = i < line2.length() ? line2.charAt(i) : ' ';

            if (i >= smileOffset && char2 != ' ') {
                combinedLine.append(char2);
            } else if (i >= rimsOffset && char2 != ' ') {
                combinedLine.append(char2);
            } else {
                combinedLine.append(char1);
            }
        }

        return combinedLine.toString();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String line : getLines()) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}
