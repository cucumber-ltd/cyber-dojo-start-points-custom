using System.Collections.Generic;

public class FakeRevenueProvider : IRevenueProvider
{
    IDictionary<int, decimal> revenueData = new Dictionary<int, decimal>();

    public FakeRevenueProvider(string data)
    {
        foreach (var tuple in data.Split(';'))
        {
            var pair = tuple.Split(',');
            revenueData[int.Parse(pair[0])] = decimal.Parse(pair[1]);
        }
    }

    public decimal GetRevenue(int customerId)
    {
        return revenueData[customerId];
    }
}
