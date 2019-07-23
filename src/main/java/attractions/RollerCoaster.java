package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

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

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 2.0) {
            return 16.80;
        }
        return defaultPrice();
    }
}
