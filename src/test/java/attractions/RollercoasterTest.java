package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(19, 2.1, 100.0);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRide() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void cannotRide() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void canCharge() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeDoubleForTallPeople() {
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.01);
    }

    @Test
    public void canChargeRegularPrice() {
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.01);
    }
}
