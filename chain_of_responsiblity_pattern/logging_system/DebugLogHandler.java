package chain_of_responsiblity_pattern.logging_system;

public class DebugLogHandler extends LogHandler{

    public DebugLogHandler(LogHandler handler) {
        super(handler);
    }

    public void log(String type, String message) {

        if(type.equals(DEBUG)) System.out.println(type+":"+message);

        else super.log(type, message);
    }
    
}
