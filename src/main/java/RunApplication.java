import BrokenDownXML.RunReport;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class RunApplication {


    public File theRunsFile = new File("C:\\Program Files (x86)\\Steam\\SteamApps\\common\\Risk of Rain 2\\Risk of Rain 2_Data\\RunReports\\PreviousRun.xml");
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
    Document myDocument = documentBuilder.parse(theRunsFile);

    public RunApplication() throws ParserConfigurationException, IOException, SAXException {
    }

    public File getTheRunsFile(){
        return theRunsFile;
    }

    public Document getMyDocument() {
        return myDocument;
    }


    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

    public RunReport whenJavaGotFromXmlFile_thenCorrect() throws IOException {
        File file = new File("C:\\Program Files (x86)\\Steam\\SteamApps\\common\\Risk of Rain 2\\Risk of Rain 2_Data\\RunReports\\PreviousRun.xml");
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        return  xmlMapper.readValue(new FileInputStream(file),  RunReport.class);
    }

    public static void main(String[] args){


    }
}
