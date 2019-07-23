package people;

import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Dodgems dodgems;
    RollerCoaster rollerCoaster;


    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void visitedAttractionsStartsAt0() {
        assertEquals(0, visitor.getNoOfAttractions());
    }

    @Test
    public void canAddAttractions() {
        visitor.canAddAttraction(dodgems);
        visitor.canAddAttraction(rollerCoaster);
        assertEquals(2, visitor.getNoOfAttractions());
    }
}
