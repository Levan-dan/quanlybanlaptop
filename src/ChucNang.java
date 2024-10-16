import java.sql.*;

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

    public void addProduct() throws SQLException {
        KetNoiCsdl ketNoiCsdl = new KetNoiCsdl();
        Connection conn = ketNoiCsdl.connect();

        String query = "insert into laptop (name, ram, ssd, chipset, price, stock) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, "Laptop dell 4.0");
        preparedStatement.setString(2, "68GB");
        preparedStatement.setString(3,"264G");
        preparedStatement.setString(4, "AMD B4500");
        preparedStatement.setDouble(5, 40000);
        preparedStatement.setInt(6, 1);
        int row = preparedStatement.executeUpdate();

        if(row != 0){
            System.out.println("them thanh cong");
        }
    }
}
