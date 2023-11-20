/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Movimiento;
import java.sql.PreparedStatement;

/**
 *
 * @author carlos
 */
public class MovimientoCON {

    Conexion cnx = new Conexion();

    public void depositar(String pinNumber, int number, String nro_tarjeta) throws SQLException {
        int saldo;
        LocalDate date = LocalDate.now();
        String query = "SELECT bankmanagmentsystem.saldo FROM cuenta where pin = ?";
        PreparedStatement stmt = cnx.obtenerConexion().prepareStatement(query);
        stmt.setString(1, pinNumber);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            saldo = rs.getInt("saldo");
        } else {
            JOptionPane.showMessageDialog(null, "Número PIN no registrado. ");
            return;
        }
        int monto = number;
        saldo = saldo + number;
        String query2 = "UPDATE bankmanagmentsystem.cuenta SET saldo = ? WHERE pin = ?";
        PreparedStatement stmt2 = cnx.obtenerConexion().prepareStatement(query2);
        stmt2.setInt(1, number);
        stmt2.setString(2, pinNumber);
        stmt2.executeUpdate();

        String query3 = "INSERT INTO bankmanagmentsystem.movimiento (fecha,monto,tipo_mov,cta_nro_tarjeta) values (?, ?, 5, ?)";
        PreparedStatement stmt3 = cnx.obtenerConexion().prepareStatement(query3);
        stmt3.setDate(1, java.sql.Date.valueOf(date));
        stmt3.setInt(2, monto);
        stmt3.setString(3, nro_tarjeta);
        stmt3.executeUpdate();

        JOptionPane.showMessageDialog(null, "$" + monto + " depositados correctamente !");
    }

    public void retirar(String pinNumber, int number, String nro_tarjeta) throws SQLException {
        int saldo;
        LocalDate date = LocalDate.now();
        String query = "SELECT bankmanagmentsystem.saldo FROM cuenta where pin = ?";
        PreparedStatement stmt = cnx.obtenerConexion().prepareStatement(query);
        stmt.setString(1, pinNumber);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            saldo = rs.getInt("saldo");
        } else {
            JOptionPane.showMessageDialog(null, "Número PIN no registrado. ");
            return;
        }
        int monto = number;
        saldo = saldo - number;
        String query2 = "UPDATE bankmanagmentsystem.cuenta SET saldo = ? WHERE pin = ?";
        PreparedStatement stmt2 = cnx.obtenerConexion().prepareStatement(query2);
        stmt2.setInt(1, number);
        stmt2.setString(2, pinNumber);
        stmt2.executeUpdate();

        String query3 = "INSERT INTO bankmanagmentsystem.movimiento (fecha,monto,tipo_mov,cta_nro_tarjeta) values (?, ?, 10, ?)";
        PreparedStatement stmt3 = cnx.obtenerConexion().prepareStatement(query3);
        stmt3.setDate(1, java.sql.Date.valueOf(date));
        stmt3.setInt(2, monto);
        stmt3.setString(3, nro_tarjeta);
        stmt3.executeUpdate();

        JOptionPane.showMessageDialog(null, "$" + monto + " retirados correctamente !");
    }

    public void cartola(String nro_tarjeta) throws SQLException {
        Movimiento movimiento = new Movimiento();
        String query = "Select * from bankmanagmentsystem.movimiento where cta_nro_tarjeta = ? AND extract(MONTH FROM fecha) = 11";
        PreparedStatement stmt = cnx.obtenerConexion().prepareStatement(query);
        stmt.setString(1, nro_tarjeta);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int id_movInt = rs.getInt("id_mov");
            String id_mov = String.valueOf(id_movInt);

            String fecha = rs.getString("fecha");

            int montoInt = rs.getInt("monto");
            String monto = String.valueOf(montoInt);

            int tipo_movString = rs.getInt("tipo_mov");
            String tipo_mov = String.valueOf(tipo_movString);

            movimiento.guardar(id_mov, fecha, monto, tipo_mov);
        }
    }

}
