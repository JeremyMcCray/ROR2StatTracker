package BrokenDownXML;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

@XmlRootElement(name = "RunReport")
public class RunReport {

    private String version;
    private String gameModeName;
    private String gameResultType;
    private String seed;
    private String snapshotTime;
    private String runStopwatchValue;
    private String ruleBook;


    private BrokenDownXML.playerInfos playerInfos;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGameModeName() {
        return gameModeName;
    }

    public void setGameModeName(String gameModeName) {
        this.gameModeName = gameModeName;
    }

    public String getGameResultType() {
        return gameResultType;
    }

    public void setGameResultType(String gameResultType) {
        this.gameResultType = gameResultType;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public String getSnapshotTime() {
        return snapshotTime;
    }

    public void setSnapshotTime(String snapshotTime) {
        this.snapshotTime = snapshotTime;
    }

    public String getRunStopwatchValue() {
        return runStopwatchValue;
    }

    public void setRunStopwatchValue(String runStopwatchValue) {
        this.runStopwatchValue = runStopwatchValue;
    }

    public String getRuleBook() {
        return ruleBook;
    }

    public void setRuleBook(String ruleBook) {
        this.ruleBook = ruleBook;
    }

    @XmlElement(name = "playerInfos")
    public BrokenDownXML.playerInfos getPlayerInfos() {
        return playerInfos;
    }

    public void setPlayerInfos(BrokenDownXML.playerInfos playerInfos) {
        this.playerInfos = playerInfos;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public String toString() {
        return "RunReport{" +
                "version='" + version + '\n' +
                ", gameModeName='" + gameModeName + '\n' +
                ", gameResultType='" + gameResultType + '\n' +
                ", seed='" + seed + '\n' +
                ", snapshotTime='" + snapshotTime + '\n' +
                ", runStopwatchValue='" + runStopwatchValue + '\n' +
                ", ruleBook='" + ruleBook + '\n' +
                ", playerInfos= this line right here --------" + playerInfos.toString() +
                "\n , additionalProperties=" + additionalProperties +
                '}';
    }
}