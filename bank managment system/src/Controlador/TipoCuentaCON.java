package Controlador;

import bd.Conexion;
import model.TipoCuenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Ocupacion;
/**
 *
 * @author carlos
 */
public class TipoCuentaCON {
   // Métodos para acceder a la tabla TipoCuenta en la base de datos 
    public TipoCuentaCON() {
        }

      public TipoCuenta BuscarId(String tipoCuenta) {
        TipoCuenta tipocuenta2 = new TipoCuenta();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "select id_tipo_cuenta FROM bankmanagmentsystem.tipo_cuenta where nombre_tipo_cuenta = '" + tipoCuenta +"';";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                 tipocuenta2.setIdTipoCuenta(rs.getInt("id_tipo_cuenta"));
            }
            rs.close();
            stmt.close();
            cnx.close();
            System.out.println("hola");
            System.out.println(tipocuenta2);
        } catch (SQLException e) {
            System.out.println("Error SQL al buscar ocupacion por nombre" + e.getMessage());
        }
        return tipocuenta2;
    }


}
