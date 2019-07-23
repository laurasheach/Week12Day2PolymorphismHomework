package attractions;

import behaviours.IEntertainment;
import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed, IEntertainment {

    public Park(String name, int rating) {
        super(name, rating);
    }
}
