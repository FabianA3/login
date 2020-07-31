
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection con;
    String url = "jdbc:mysql://localhost/proyectojava";
    String user = "root";
    String pass = "";
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
        }
        return con;
    }
}
 