/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public void agregarCuenta(Cuenta cuenta) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO bankmanagmentsystem.cuenta (nro_tarjeta, pinNumber, saldo, cvv, estado,run_cliente,tipo_cuenta) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, cuenta.getNro_tarjeta());
            stmt.setString(2, cuenta.getPinNumber());
            stmt.setInt(3, cuenta.getSaldo());
            stmt.setString(4, cuenta.getCvv());
            stmt.setBoolean(5, cuenta.isEstado());
            stmt.setString(6, cuenta.getTipoCuenta());

            stmt.executeUpdate();

            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar cuenta: " + e.getMessage());
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
