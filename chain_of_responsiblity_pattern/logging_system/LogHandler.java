package chain_of_responsiblity_pattern.logging_system;

public class LogHandler{

    public static String ERROR = "error";
    public static String DEBUG = "debug";
    public static String INFO = "info";

    LogHandler nextHandler;

    public LogHandler(LogHandler handler){

        this.nextHandler = handler;

    }

    public void log(String type,String message){

        if(nextHandler!=null) nextHandler.log(type, message);

    }

    
}