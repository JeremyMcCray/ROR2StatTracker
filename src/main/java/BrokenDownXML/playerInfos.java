package BrokenDownXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.HashMap;
import java.util.Map;


public class playerInfos {


    private PlayerInfo playerInfo;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @XmlElement(name = "PlayerInfo")
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


    @Override
    public String toString() {
        return "PlayerInfos{" +
                "playerInfo=" + playerInfo +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}