using System;
using NUnit.Framework;


[TestFixture]
public abstract class RevenueProviderContract
{
    // private IRevenueProvider revenueProvider;

    protected abstract IRevenueProvider GetRevenueProvider();

    [SetUp]
    public void setup()
    {
        // revenueProvider = GetRevenueProvider();
    }

    [Test]
    public void revenue_provider_returns_revenue_for_valid_customer_id()
    {
    }

    [Test]
    public void revenue_provider_throws_exception_for_invalid_customer_id()
    {
    }
}
