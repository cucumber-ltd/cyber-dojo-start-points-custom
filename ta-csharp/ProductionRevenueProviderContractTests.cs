public class ProductionRevenueProviderContractTests
                            : RevenueProviderContract {

    public ProductionRevenueProviderContractTests() {}

    protected override IRevenueProvider GetRevenueProvider(){
        return new ProductionRevenueProvider();
    }
}
