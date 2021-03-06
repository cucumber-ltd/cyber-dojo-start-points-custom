using System.IO;
using System.Collections.Generic;
using System.Xml;

class ShoutyReportJob
{
    public static void Main(string[] args)
    {
        var path = args[0];
        var mileageClaims = ReadMileageClaims(path);

        var job = new ShoutyReportProcessor(mileageClaims);
        WriteEcoStatReport(job.Process());
    }

        /*
        private static IRevenueProvider CreateStatsService()
        {
            if (System.Environment.GetEnvironmentVariable("FAKE_INITIALISATION_DATA") != null)
            {
                return new FakeStatsService(
                    System.Environment.GetEnvironmentVariable("FAKE_INITIALISATION_DATA"));
            }

            return new ProductionRevenueProvider(new ShoutyStatsService());
        }
        */

    private static IList<MileageClaim> ReadMileageClaims(string claimsPath)
    {
        var mileageClaims = new List<MileageClaim>();
        using (var reader = new StreamReader(claimsPath))
        {
            while (!reader.EndOfStream)
            {
                var values = reader.ReadLine().Split(',');
                mileageClaims.Add(new MileageClaim(values[0], int.Parse(values[1]), int.Parse(values[2])));
            }
        }
        return mileageClaims;
    }

    private static void WriteEcoStatReport(List<EcoStat> results)
    {

        XmlDocument reportXml = new XmlDocument();
        reportXml.LoadXml("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ecoReport/>");
        foreach (var ecoStat in results)
        {
            XmlElement node = reportXml.CreateElement(string.Empty, "ecoStat", string.Empty);
            node.SetAttribute("SalespersonName", ecoStat.SalesPersonName);
            node.SetAttribute("RevenuePerMile", System.Convert.ToString(ecoStat.RevenuePerMile));
            reportXml.DocumentElement.AppendChild(node);
        }

        reportXml.Save("report.xml");
    }
}
