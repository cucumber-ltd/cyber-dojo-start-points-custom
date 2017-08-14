public class ProductionRevenueProviderContractTests
                            extends RevenueProviderContract {

    public ProductionRevenueProviderContractTests() {}

    @Override
    protected ProductionRevenueProvider getRevenueProvider(){
        return new ProductionRevenueProvider();
    }
}
