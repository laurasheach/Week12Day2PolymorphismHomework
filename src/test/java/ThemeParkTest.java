import attractions.Dodgems;
import attractions.RollerCoaster;
import behaviours.IEntertainment;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;
    IceCreamStall iceCreamStall;
    CandyflossStall candyflossStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        themePark = new ThemePark("Fun Park");
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 9);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 8);
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(19, 2.1, 100.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Fun Park", themePark.getName());
    }

    @Test
    public void entertainmentStartsAt0() {
        assertEquals(0, themePark.entertainmentCount());
    }

    @Test
    public void canAddEntertainment() {
        themePark.addEntertainment(dodgems);
        themePark.addEntertainment(rollerCoaster);
        themePark.addEntertainment(rollerCoaster);
        themePark.addEntertainment(iceCreamStall);
        assertEquals(4, themePark.entertainmentCount());
    }

    @Test
    public void canAddReviewed() {
        themePark.getAllReviewed((dodgems));
        themePark.getAllReviewed(iceCreamStall);
        assertEquals(2, themePark.reviewedCount());
    }
}
