package chain_of_responsiblity_pattern.logging_system;

public class InfoLogHandler extends LogHandler{

    public InfoLogHandler(LogHandler handler) {
        super(handler);
        
    }

    @Override
    public void log(String type, String message) {

        if(type.equals(INFO)) System.out.println(type+":"+message);
        
        else super.log(type, message);
    }
    
}
