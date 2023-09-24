//Laura Nolan
package factory;


/**
 * Represents a strider, a type of Bike.
 */
public class Strider extends Bike {
    public Strider() {
        super("Strider", 100.0, 2, false, false);
    }


    @Override
    protected String createFrame() {
        return "- Assembling Strider frame";
    }


    @Override
    protected String addWheels() {
        return "- Adding 2 wheel(s)";
    }
}

