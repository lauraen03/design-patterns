//Laura Nolan
package factory;


/**
 * Represents a tricycle, a type of Bike.
 */
public class Tricycle extends Bike {
      /**
     * Constructs a new Tricycle object.
     */
    public Tricycle() {
        super("Tricycle", 100.0, 3, true, false);
    }


    @Override
    protected String createFrame() {
        return "- Assembling Tricycle frame";
    }


    @Override
    protected String addWheels() {
        return "- Adding 3 wheel(s)";
    }
}

