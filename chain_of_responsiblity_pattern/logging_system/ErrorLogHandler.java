package chain_of_responsiblity_pattern.logging_system;

public class ErrorLogHandler extends LogHandler {

    public ErrorLogHandler(LogHandler nextHandler) {
        super(nextHandler);
        
    }

    @Override
    public void log(String type, String message) {

        if(type.equals(ERROR)) System.out.println(type+":"+message);

        else super.log(type, message);
    }
    
}
