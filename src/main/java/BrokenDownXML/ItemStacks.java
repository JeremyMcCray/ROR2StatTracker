package BrokenDownXML;

import java.util.HashMap;
import java.util.Map;

public class ItemStacks {

    private String syringe;
    private String critGlasses;
    private String attackSpeedOnCrit;
    private String sprintOutOfCombat;
    private String personalShield;
    private String bandolier;
    private String stunChanceOnHit;
    private String bossDamageBonus;
    private String energizedOnEquipmentUse;
    private String nearbyDamageBonus;
    private String monsoonPlayerHelper;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getSyringe() {
        return syringe;
    }

    public void setSyringe(String syringe) {
        this.syringe = syringe;
    }

    public String getCritGlasses() {
        return critGlasses;
    }

    public void setCritGlasses(String critGlasses) {
        this.critGlasses = critGlasses;
    }

    public String getAttackSpeedOnCrit() {
        return attackSpeedOnCrit;
    }

    public void setAttackSpeedOnCrit(String attackSpeedOnCrit) {
        this.attackSpeedOnCrit = attackSpeedOnCrit;
    }

    public String getSprintOutOfCombat() {
        return sprintOutOfCombat;
    }

    public void setSprintOutOfCombat(String sprintOutOfCombat) {
        this.sprintOutOfCombat = sprintOutOfCombat;
    }

    public String getPersonalShield() {
        return personalShield;
    }

    public void setPersonalShield(String personalShield) {
        this.personalShield = personalShield;
    }

    public String getBandolier() {
        return bandolier;
    }

    public void setBandolier(String bandolier) {
        this.bandolier = bandolier;
    }

    public String getStunChanceOnHit() {
        return stunChanceOnHit;
    }

    public void setStunChanceOnHit(String stunChanceOnHit) {
        this.stunChanceOnHit = stunChanceOnHit;
    }

    public String getBossDamageBonus() {
        return bossDamageBonus;
    }

    public void setBossDamageBonus(String bossDamageBonus) {
        this.bossDamageBonus = bossDamageBonus;
    }

    public String getEnergizedOnEquipmentUse() {
        return energizedOnEquipmentUse;
    }

    public void setEnergizedOnEquipmentUse(String energizedOnEquipmentUse) {
        this.energizedOnEquipmentUse = energizedOnEquipmentUse;
    }

    public String getNearbyDamageBonus() {
        return nearbyDamageBonus;
    }

    public void setNearbyDamageBonus(String nearbyDamageBonus) {
        this.nearbyDamageBonus = nearbyDamageBonus;
    }

    public String getMonsoonPlayerHelper() {
        return monsoonPlayerHelper;
    }

    public void setMonsoonPlayerHelper(String monsoonPlayerHelper) {
        this.monsoonPlayerHelper = monsoonPlayerHelper;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
