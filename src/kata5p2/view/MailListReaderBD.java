package kata5p2.view;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class MailListReaderBD {
    
    private Connection connect(){
        String url = "jdbc:sqlite:kata5.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
        // Tambien me doy asco programando
    }
    public List<String> read() {
        LinkedList<String> MailList = new LinkedList<>();
        String cadena;
        String sql = "SELECT * FROM EMAIL";
        try (Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            // Bucle sobre el conjunto de registros.
            while (rs.next()) {
                cadena= rs.getString("Mail");
                if(cadena.contains("@")){
                    MailList.add(cadena);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return MailList;
    }
}
