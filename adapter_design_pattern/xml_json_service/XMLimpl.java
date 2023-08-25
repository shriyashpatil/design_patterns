package adapter_design_pattern.xml_json_service;

public class XMLimpl implements XML {

    @Override
    public String getXml() {
        System.out.println("xml : <>");
        return "<>";
    }
    
}
