package chain_of_responsiblity_pattern.logging_system;

public class Client {


    public static void main(String args[]){

        /// create chain of log handler
        LogHandler LOG = new InfoLogHandler(new ErrorLogHandler(new DebugLogHandler(null)));

        LOG.log("error", "error occured");
        LOG.log("info","Hi this is handler pattern");
        LOG.log("debug","debugging the chain of responsiblity");


    }
    
}
