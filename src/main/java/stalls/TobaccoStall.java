package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private int minAge;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.minAge = 18;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() < minAge) {
            return false;
        }
        return true;
    }
}
