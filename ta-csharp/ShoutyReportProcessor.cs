using System.Collections.Generic;
using System.Xml;

class ShoutyReportProcessor
{
    IList<MileageClaim> mileageClaims;
    ShoutyStatsService statsService = new ShoutyStatsService();

    public ShoutyReportProcessor(IList<MileageClaim> mileageClaims)
    {
        this.mileageClaims = mileageClaims;
    }

    public List<EcoStat> Process()
    {
        List<EcoStat> results = new List<EcoStat>();

        foreach (var claim in mileageClaims)
        {
            string requestXml = "<Customer id=\"" + claim.CustomerID + "\"/>";
            string responseXml = statsService.GetRevenueForCustomer(requestXml);

            var responseDocument = new XmlDocument();
            responseDocument.LoadXml(responseXml);

            var revenue = decimal.Parse(responseDocument.DocumentElement.Attributes["revenue"].Value);
            var revenuePerMile = (float)revenue / (float)claim.Miles;

            results.Add(new EcoStat(claim.Name, revenuePerMile));
        }

        return results;
    }
}
