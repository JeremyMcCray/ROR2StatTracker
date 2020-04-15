package BrokenDownXML;

import java.util.HashMap;
import java.util.Map;

public class PlayerInfos {

    private PlayerInfo playerInfo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public PlayerInfo getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(PlayerInfo playerInfo) {
        this.playerInfo = playerInfo;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}