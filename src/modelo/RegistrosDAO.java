package modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

public class RegistrosDAO {

    PreparedStatement ps;
    ResultSet rs;

    EntidadRegistro er = new EntidadRegistro();
    conexion con = new conexion();
    Connection acceso;

    public EntidadRegistro ValidarRegistro(String correo, String contrasena) {
        String sql = "select * from registros where correo=? and contrasena = ?";
        try {
            acceso = con.conectar();
            ps = (PreparedStatement) acceso.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, contrasena);
            rs = ps.executeQuery();
            while (rs.next()) {
                er.setIdre(rs.getInt(1));
                er.setNombres(rs.getString(2));
                er.setTelefono(rs.getString(3));
                er.setCorreo(rs.getString(4));
                er.setContrasena(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return er;
    }
}
