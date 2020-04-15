package BrokenDownXML;

import java.util.HashMap;
import java.util.Map;

public class StatSheet {

    private Fields fields;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}