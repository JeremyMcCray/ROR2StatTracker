package BrokenDownXML;


import java.util.HashMap;
import java.util.Map;

public class RunReport {

    private String version;
    private String gameModeName;
    private String gameResultType;
    private String seed;
    private String snapshotTime;
    private String runStopwatchValue;
    private String ruleBook;
    private PlayerInfos playerInfos;
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

    public PlayerInfos getPlayerInfos() {
        return playerInfos;
    }

    public void setPlayerInfos(PlayerInfos playerInfos) {
        this.playerInfos = playerInfos;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}