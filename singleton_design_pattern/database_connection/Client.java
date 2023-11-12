package database_connection;

public class Client{

    public static void main(String args[]){

        /// connect db
        DatabaseConnection user1 = DatabaseConnection.getInstance();

        user1.save("user1");

        DatabaseConnection user2 = DatabaseConnection.getInstance();
        user2.save("user2");

    }

}