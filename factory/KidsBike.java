//Laura Nolan 
package factory;

/**
 * Represents a kids bike, a type of Bike.
 */
public class KidsBike extends Bike {
    public KidsBike() {
        super("Kids Bike", 100.0, 2, true, true);
    }

    @Override
    protected String createFrame() {
        return "- Assembling Kids Bike frame";
    }

    @Override
    protected String addWheels() {
        return "- Adding 2 wheel(s)";
    }

    @Override
    protected String addPedals() {
        return "- Adding pedals\n- Adding training wheels";
    }
}
