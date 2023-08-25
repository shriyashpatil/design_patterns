package adapter_design_pattern.xml_json_service;

public class JSONAdapter implements Adapter {

    XML xml;

    public JSONAdapter(XML xml){
        this.xml = xml;
    }

    @Override
    public String convert() {
        
        String xmlData = xml.getXml();

        ///convert xml to json
        System.out.println("converting to json  : {}");
        String jsonData = xmlData.replace("<>", "{}");

        return jsonData;

    }
    
}
