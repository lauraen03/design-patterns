//Laura Nolan CSCE247
package decorator;

import java.util.ArrayList;
/**
 * Decorator for adding Rims to a vehicle.
 */
public class Rims extends VehicleDecorator {
    private ArrayList<String> rimsLines;

     /**
     * Constructor for the Rims class.
     * @param vehicle The vehicle that has rims added to it
     */

    public Rims(Vehicle vehicle) {
        super(vehicle);
        this.rimsLines = FileReader.getLines("decorator/TXT/rims.txt");
    }

    @Override
    public ArrayList<String> getLines() {
        ArrayList<String> decoratedLines = decoratedVehicle.getLines();
        ArrayList<String> combinedLines = new ArrayList<>();

        int maxLineCount = Math.max(decoratedLines.size(), rimsLines.size());

        for (int i = 0; i < maxLineCount; i++) {
            String decoratedLine = i < decoratedLines.size() ? decoratedLines.get(i) : "";
            String rimsLine = i < rimsLines.size() ? rimsLines.get(i) : "";

            String combinedLine = combineLines(decoratedLine, rimsLine);
            combinedLines.add(combinedLine);
        }

        return combinedLines;
    }

    private String combineLines(String line1, String line2) {
        int maxLength = Math.max(line1.length(), line2.length());
        StringBuilder combinedLine = new StringBuilder(maxLength);

       
        int rimsStartLine = 7;  
        int rimsEndLine = 18;    

        for (int i = 0; i < maxLength; i++) {
            char char1 = i < line1.length() ? line1.charAt(i) : ' ';
            char char2 = i < line2.length() ? line2.charAt(i) : ' ';

            if (i >= rimsStartLine && i <= rimsEndLine && char2 != ' ') {
                combinedLine.append(char2);
            } else {
                combinedLine.append(char1);
            }
        }

        return combinedLine.toString();
    }
}
