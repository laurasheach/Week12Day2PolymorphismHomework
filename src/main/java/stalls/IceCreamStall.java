package stalls;

import behaviours.IEntertainment;
import behaviours.IReviewed;

public class IceCreamStall extends Stall implements IReviewed, IEntertainment {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

}
