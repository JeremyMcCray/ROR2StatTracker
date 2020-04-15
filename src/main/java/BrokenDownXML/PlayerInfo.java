package BrokenDownXML;
import java.util.HashMap;
import java.util.Map;

public class PlayerInfo {

    private String name;
    private String bodyName;
    private String killerBodyName;
    private StatSheet statSheet;
    private String itemAcquisitionOrder;
    private ItemStacks itemStacks;
    private String equipment;
    private String finalMessageToken;
    private String localPlayerIndex;
    private String userProfileFileName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBodyName() {
        return bodyName;
    }

    public void setBodyName(String bodyName) {
        this.bodyName = bodyName;
    }

    public String getKillerBodyName() {
        return killerBodyName;
    }

    public void setKillerBodyName(String killerBodyName) {
        this.killerBodyName = killerBodyName;
    }

    public StatSheet getStatSheet() {
        return statSheet;
    }

    public void setStatSheet(StatSheet statSheet) {
        this.statSheet = statSheet;
    }

    public String getItemAcquisitionOrder() {
        return itemAcquisitionOrder;
    }

    public void setItemAcquisitionOrder(String itemAcquisitionOrder) {
        this.itemAcquisitionOrder = itemAcquisitionOrder;
    }

    public ItemStacks getItemStacks() {
        return itemStacks;
    }

    public void setItemStacks(ItemStacks itemStacks) {
        this.itemStacks = itemStacks;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getFinalMessageToken() {
        return finalMessageToken;
    }

    public void setFinalMessageToken(String finalMessageToken) {
        this.finalMessageToken = finalMessageToken;
    }

    public String getLocalPlayerIndex() {
        return localPlayerIndex;
    }

    public void setLocalPlayerIndex(String localPlayerIndex) {
        this.localPlayerIndex = localPlayerIndex;
    }

    public String getUserProfileFileName() {
        return userProfileFileName;
    }

    public void setUserProfileFileName(String userProfileFileName) {
        this.userProfileFileName = userProfileFileName;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}