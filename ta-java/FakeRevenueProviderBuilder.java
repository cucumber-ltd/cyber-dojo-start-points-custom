import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeRevenueProviderBuilder {
    private String defaultCustomerData = "19,123456.78;22,123456.78;57,123456.78";
    private Map<Integer,Double> builderData = null;

    public RevenueProvider build() {
        String initialisationData = "";

        if (builderData == null) {
            initialisationData = defaultCustomerData;
        } else {
            String separator = "";

            for (Map.Entry<Integer, Double> entry : builderData.entrySet()) {
                initialisationData += separator + entry.getKey() + "," + entry.getValue();
                separator = ";";
            }
        }
        return new FakeRevenueProvider(initialisationData);
    }

    public FakeRevenueProviderBuilder withCustomerRevenue(int id, double revenue) {
        if (builderData == null) {
          builderData = new HashMap<Integer,Double>();
        }

        builderData.put(id, revenue);

        return this;
    }
}
