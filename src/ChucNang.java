import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ChucNang {

    public void listSanPham() throws SQLException {
        KetNoiCsdl ketNoiCsdl = new KetNoiCsdl();
        Connection conn = ketNoiCsdl.connect();

        String query = "select * from laptop";
        Statement statement = conn.createStatement();
        ResultSet rt = statement.executeQuery(query);
        while(rt.next()){
            int id = rt.getInt("id_laptop");
            String name = rt.getString("name");
            String ram = rt.getString("ram");
            String ssd = rt.getString("ssd");
            String chipset = rt.getString("chipset");
            double price = rt.getDouble("price");
            int stock = rt.getInt("stock");
            System.out.println(id + "--" + name +"--" + ram + "--" + ssd + "--" + chipset + "--" + price +"--" + stock);
        }
    }
}
