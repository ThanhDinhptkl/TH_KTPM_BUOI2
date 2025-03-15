import org.json.JSONObject;
import org.json.XML;
public class XMLJSONAdapter implements DataFormatConverter {
    private LegacyXMLSystem legacyXMLSystem;

    public XMLJSONAdapter(LegacyXMLSystem legacyXMLSystem) {
        this.legacyXMLSystem = legacyXMLSystem;
    }

    @Override
    public String convertToJSON(String xmlData) {
         JSONObject json = XML.toJSONObject(xmlData);
        return json.toString(4); // Pretty print JSON
    }

    @Override
    public String convertToXML(String jsonData) {
        JSONObject json = new JSONObject(jsonData);
        return XML.toString(json);
    }

    public String getConvertedJSON() {
        String xmlData = legacyXMLSystem.getXMLData();
        return convertToJSON(xmlData);
    }
}
