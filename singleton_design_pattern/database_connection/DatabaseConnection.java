package database_connection;

public class DatabaseConnection{

    private static DatabaseConnection db = null;
    private String dbUrl;
    private String dbPort;
    private DatabaseConnection(){
        this.dbUrl = "db://localhost";
        this.dbPort = 3006;
    }
    public static DatabaseConnection getInstance(){
        if(db==null) {
            synchronized (this) {
                if (db == null) db = new DatabaseConnection();
            }
        }
        return db;
    }
    public void save(String user) {
        System.out.println("Saved in DB for user : " + user + " at port : " + this.dbPort + " and url : " + this.dbUrl);
    }
}