package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor1 = new Visitor(11, 1.2, 40.0);
        visitor2 = new Visitor(19, 2.1, 100.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canCharge() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeForUnder12s() {
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.01);
    }

    @Test
    public void canChargeForOver12s() {
        assertEquals(4.5, dodgems.priceFor(visitor2), 0.01);
    }
}
