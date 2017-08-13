public class ProductionRevenueProviderContractTests
                            extends RevenueProviderContract {

    public ProductionRevenueProviderContractTests() {}

    @Override
    protected ProductionRevenueProvider createInstance(){
        return new ProductionRevenueProvider();
    }
}
