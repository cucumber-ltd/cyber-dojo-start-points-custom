import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

class ShoutyReportJob {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        List<MileageClaim> mileageClaims = readMileageClaims(path);

        ShoutyReportProcessor job = new ShoutyReportProcessor(mileageClaims);
        writeEcoStatReport(job.process());
    }

/*
    private static RevenueProvider createRevenueProvider() {
        if (System.getenv().get("FAKE_INITIALISATION_DATA") != null) {
            return new FakeRevenueProvider(
                System.getenv().get("FAKE_INITIALISATION_DATA"));
        }

        return new ProductionRevenueProvider();
    }
*/

    private static List<MileageClaim> readMileageClaims(String claimsPath) throws IOException {
        List<MileageClaim> mileageClaims = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(claimsPath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            mileageClaims.add(new MileageClaim(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2])));
        }
        return mileageClaims;
    }


    private static void writeEcoStatReport(List<EcoStat> results) {
        Document doc = XmlHelper.newDocument();
        Element ecoReport = doc.createElement("ecoReport");
        doc.appendChild(ecoReport);

        for (EcoStat stat : results) {
            Element node = doc.createElement("ecoStat");
            node.setAttribute("SalespersonName", stat.salesPersonName);
            node.setAttribute("RevenuePerMile", String.valueOf(stat.revenuePerMile));
            ecoReport.appendChild(node);
        }

        XmlHelper.write(doc, "report.xml");
    }
}
