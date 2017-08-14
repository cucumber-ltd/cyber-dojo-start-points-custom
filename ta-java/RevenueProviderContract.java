import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public abstract class RevenueProviderContract {


  private RevenueProvider revenueProvider;

  protected abstract RevenueProvider getRevenueProvider();

  @Before
  public void setUp() {
    revenueProvider = getRevenueProvider();
  }

  @Test
  public void revenue_provider_returns_revenue_for_valid_customer_id() {
  }

  @Test
  public void revenue_provider_throws_exception_for_invalid_customer_id() {
  }
}
