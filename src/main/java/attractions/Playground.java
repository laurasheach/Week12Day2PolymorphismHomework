package attractions;

import behaviours.IEntertainment;
import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed, IEntertainment {

    private int maxAge;

    public Playground(String name, int rating) {
        super(name, rating);
        this.maxAge = 15;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > maxAge) {
            return false;
        }
        return true;
    }
}
