package adapter_design_pattern.xml_json_service;

public class Client {
    

    public static void main(String args[]){

        Adapter adapter = new JSONAdapter(new XMLimpl());

        System.out.println("Result : "+adapter.convert());

    }

}
