package module8;

public class DatabaseConnector {

    private static DatabaseConnector databaseConnector;

    private DatabaseConnector(String username, String password, String databaseName) {
        System.out.println("Connection with username " + username +
        " and databaseName " + databaseName + "established.");
    }

    public static DatabaseConnector getInstance() {
        if (databaseConnector == null) {
            databaseConnector = new DatabaseConnector("Sofiia", "123345", "oracle-db-test");
        }
        return databaseConnector;
    }

}
