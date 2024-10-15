import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoiCsdl {
    private String url = "jdbc:mysql://localhost:3306/quanlybanlaptop";
    private String username = "root";
    private String pass = "882005";
    public Connection connect() throws SQLException {
        Connection connection = DriverManager.getConnection(url, username, pass);
        System.out.println("thanh cong");
        return connection;
    }
}
