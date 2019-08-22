import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    Connection con = null;
    private String DB_URL = "jdbc:mysql://localhost:3306/demo";
    private String DB_USER = "root";
    private String DB_PWD = "8Characterss!";

    public Connection getConnection(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL,DB_USER,DB_PWD);
        }catch (Exception e){
            e.printStackTrace();
        }

        return con;
    }
}
