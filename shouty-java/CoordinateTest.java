import junit.framework.TestCase;
import org.junit.Test;

public class CoordinateTest extends TestCase {

    @Test
    public void testItCalculatesTheDistanceFromItself() {
        Coordinate a = new Coordinate(0, 0);
        assertEquals(0, a.distanceFrom(a));
    }

    @Test
    public void testItCalculatesTheDistanceFromAnotherCoordinateAlongXAxis() {
        Coordinate a = new Coordinate(0, 0);
        Coordinate b = new Coordinate(1000, 0);
        assertEquals(1000, a.distanceFrom(b));
    }
}
