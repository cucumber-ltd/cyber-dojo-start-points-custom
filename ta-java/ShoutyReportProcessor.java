import org.w3c.dom.Document;

import java.util.List;

class ShoutyReportProcessor {
    List<MileageClaim> mileageClaims;
    ShoutyStatsService statsService = new ShoutyStatsService();

    public ShoutyReportProcessor(List<MileageClaim> mileageClaims) {
        this.mileageClaims = mileageClaims;
    }

    public List<EcoStat> process() {
        List<EcoStat> results = new ArrayList<EcoStat>();

        for (MileageClaim claim : mileageClaims) {
            String requestXml = "<Customer id=\"" + claim.customerID + "\"/>";
            String responseXml = statsService.getRevenueForCustomer(requestXml);
            Document responseDocument = XmlHelper.parse(responseXml);

            double revenue = Double.parseDouble(responseDocument.getDocumentElement().getAttribute("revenue"));
            float revenuePerMile = (float) revenue / (float) claim.miles;

            results.add(new EcoStat(claim.name, revenuePerMile));
        }

        return results;
    }
}
