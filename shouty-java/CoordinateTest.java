import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {

    @Test
    public void itCalculatesTheDistanceFromItself() {
        Coordinate a = new Coordinate(0, 0);
        Assert.assertEquals(0, a.distanceFrom(a));
    }

    @Test
    public void itCalculatesTheDistanceFromAnotherCoordinateAlongXAxis() {
        Coordinate a = new Coordinate(0, 0);
        Coordinate b = new Coordinate(1000, 0);
        Assert.assertEquals(1000, a.distanceFrom(b));
    }
}
