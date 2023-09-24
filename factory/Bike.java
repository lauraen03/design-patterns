//Laura Nolan
package factory;


/**
 * Represents a bike.
 */
public abstract class Bike {
    private String name;
    private double price;
    private int numWheels;
    private boolean hasPedals;
    private boolean hasTrainingWheels;
    /**
     * Constructs a new Bike object with the following parameters.
     *
     * @param name             The name of the bike.
     * @param price            The price of the bike.
     * @param numWheels        The number of wheels the bike has
     * @param hasPedals        Indicates whether or not the bike has pedals.
     * @param hasTrainingWheels Indicates whether or not the bike has training wheels.
     */


    public Bike(String name, double price, int numWheels, boolean hasPedals, boolean hasTrainingWheels) {
        this.name = name;
        this.price = price;
        this.numWheels = numWheels;
        this.hasPedals = hasPedals;
        this.hasTrainingWheels = hasTrainingWheels;
    }
 /**
     * Assembles the bike and returns statements describing the process.
     *
     * @return A string describing the bike assembly process.
     */
    public String assembleBike() {
        StringBuilder assemblySteps = new StringBuilder();
        assemblySteps.append("Creating a ").append(name).append("\n");
        assemblySteps.append(createFrame()).append("\n");
        assemblySteps.append(addWheels()).append("\n");
        assemblySteps.append(addPedals()).append("\n");
        return assemblySteps.toString();
    }
/**
     * Creates the frame of the bike.
     *
     * @return A string describing the frame creation process.
     */
    protected abstract String createFrame();
    /**
     * Adds wheels to the bike.
     *
     * @return A string describing the process of adding wheels.
     */


    protected abstract String addWheels();
   /**
     * Adds pedals to the bike if applicable.
     *
     * @return A string describing the process of adding a pedal, or if no pedals are added-an empty string.
     */
    protected String addPedals() {
        return hasPedals ? "- Adding pedals" : "";
    }
 /**
     * Gets the price of the bike.
     *
     * @return The price of the bike.
     */
    public double getPrice() {
        return price;
    }
}

    
