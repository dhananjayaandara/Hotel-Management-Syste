
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnetion {

    private static final String URL = "jdbc:mysql://localhost:3306/hotels";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "200035300618";
    
    public static Connection getConnection(String jdbcmysqllocalhost3306hotels, String root, String string) throws SQLException{
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
        
    }catch (ClassNotFoundException e){
    return null;
    }
    }
}
