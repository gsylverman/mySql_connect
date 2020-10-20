import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            String databaseName = "sales";
            String url = "jdbc:mysql://localhost:3306/" + databaseName;
            String userName = "root";
            String password = "mysql";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO customers (name, invoice_id) " +
                    "VALUES('Alan', 49)");
            ResultSet result = statement.getResultSet();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
