import org.junit.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;

public class ShoutSteps {
    private final String ARBITRARY_MESSAGE = "Hello, world";
    private final Shouty shouty = new Shouty();

    @Given("^Lucy is at (\\d+), (\\d+)$")
    public void lucyIsAt(int xCoord, int yCoord) throws Throwable {
        shouty.setLocation("Lucy", new Coordinate(xCoord, yCoord));
    }

    @Given("^Sean is at (\\d+), (\\d+)$")
    public void seanIsAt(int xCoord, int yCoord) throws Throwable {
        shouty.setLocation("Sean", new Coordinate(xCoord, yCoord));
    }

    @When("^Sean shouts$")
    public void seanShouts() throws Throwable {
        shouty.shout("Sean", ARBITRARY_MESSAGE);
    }

    @Then("^Lucy should hear Sean$")
    public void lucyShouldHearHim() throws Throwable {
        Assert.assertEquals(1, shouty.getShoutsHeardBy("Lucy").size());
    }

    @Then("^Lucy should hear nothing$")
    public void lucy_should_hear_nothing() throws Throwable {
        Assert.assertEquals(0, shouty.getShoutsHeardBy("Lucy").size());
    }
}
