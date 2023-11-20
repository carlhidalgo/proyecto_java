package Controlador;

import Vista.Login1;
import bd.Conexion;
import model.Cuenta;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import model.Cliente;

/**
 *
 * @author carlos
 */
public class CuentaDAO {

    public CuentaDAO() {
    }

    public boolean loginCuenta(String ctarjeta, String cpin) {

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "select * from bankmanagmentsystem.cuenta where nro_tarjeta = '" + "ctarjeta"
                    + "' and pin = '" + cpin + "';";
            try (PreparedStatement stmt = cnx.prepareStatement(query); // stmt.setString(1, idUsuario);
                    ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
        }
        return false;
    }

    public boolean agregarCuenta(Cuenta cuenta,Cliente cliente) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO bankmanagmentsystem.cuenta (nro_tarjeta, pin, saldo, cvv, estado,run_cliente,tipo_cuenta) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, cuenta.getNro_tarjeta());
            stmt.setString(2, cuenta.getPinNumber());
            stmt.setInt(3, cuenta.getSaldo());
            stmt.setString(4, cuenta.getCvv());
            stmt.setBoolean(5, cuenta.isEstado());
            stmt.setString(6, cliente.getRun());
            stmt.setInt(7, cuenta.getTipoCuenta());

            stmt.executeUpdate();

            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar cuenta: " + e.getMessage());
            return false;
        }
    }

    public String balance(String nro_tarjeta, Conexion cnx) throws SQLException {
        String query = "Select saldo from cuenta where nro_tarjeta = ?";
        PreparedStatement stmt = cnx.obtenerConexion().prepareStatement(query);
        stmt.setString(1, nro_tarjeta);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            int saldo = rs.getInt("saldo");
            return String.valueOf(saldo);
        } else {
            return null;
        }
    }
}