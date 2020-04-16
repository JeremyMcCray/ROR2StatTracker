import BrokenDownXML.RunReport;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import javax.xml.bind.JAXBContext;

public class RunApplication {

    public static void main(String[] args){
        try {
            InputStream is = new FileInputStream("C:\\Program Files (x86)\\Steam\\SteamApps\\common\\Risk of Rain 2\\Risk of Rain 2_Data\\RunReports\\PreviousRun.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(RunReport.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            RunReport runReport = (RunReport) jaxbUnmarshaller.unmarshal(is);
            System.out.println(runReport.toString());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
