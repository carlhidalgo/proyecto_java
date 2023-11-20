package Controlador;

import bd.Conexion;
import model.TipoCuenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author carlos
 */
public class TipoCuentaCON {
   // Métodos para acceder a la tabla TipoCuenta en la base de datos 
public int BuscarIdTipoCuenta(String nombreTipoCuenta) {
    TipoCuenta tipoCuenta = new TipoCuenta();
    try {
        Conexion con = new Conexion();
        Connection cnx = con.obtenerConexion();

        String query = "select id_tipo_cuenta FROM bankmanagmentsystem.tipo_cuenta where nombre_tipo_cuenta = '" + nombreTipoCuenta +"';";
        PreparedStatement stmt = cnx.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
             tipoCuenta.setIdTipoCuenta(rs.getInt("id_tipo_cuenta"));
        }
        rs.close();
        stmt.close();
        cnx.close();

    } catch (SQLException e) {
        System.out.println("Error SQL al buscar tipo de cuenta por nombre" + e.getMessage());
    }
    return tipoCuenta.getIdTipoCuenta();
}


}
