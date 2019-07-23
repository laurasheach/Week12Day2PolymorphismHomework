package stalls;

import behaviours.IEntertainment;
import behaviours.IReviewed;

public class CandyflossStall extends Stall implements IReviewed, IEntertainment {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
    }

}
