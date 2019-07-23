package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    private double minHeight;
    private int minAge;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.minHeight = 1.45;
        this.minAge = 12;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getHeight() < minHeight || visitor.getAge() < 12) {
            return false;
        }
        return true;
    }
}
