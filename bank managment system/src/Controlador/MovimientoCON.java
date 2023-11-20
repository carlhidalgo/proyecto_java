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

    Conexion con = new Conexion();

    public void depositar(String pinNumber, int number, String nro_tarjeta) throws SQLException {
        int saldo;
        LocalDate date = LocalDate.now();
        String query = "SELECT bankmanagmentsystem.saldo FROM cuenta where pin = ?";
        
        PreparedStatement stmt = con.obtenerConexion().prepareStatement(query);
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
        PreparedStatement stmt2 = con.obtenerConexion().prepareStatement(query2);
        stmt2.setInt(1, number);
        stmt2.setString(2, pinNumber);
        stmt2.executeUpdate();

        String query3 = "INSERT INTO bankmanagmentsystem.movimiento (fecha,monto,tipo_mov,cta_nro_tarjeta) values (?, ?, 5, ?)";
        PreparedStatement stmt3 = con.obtenerConexion().prepareStatement(query3);
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
        PreparedStatement stmt = con.obtenerConexion().prepareStatement(query);
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
        PreparedStatement stmt2 = con.obtenerConexion().prepareStatement(query2);
        stmt2.setInt(1, number);
        stmt2.setString(2, pinNumber);
        stmt2.executeUpdate();

        String query3 = "INSERT INTO bankmanagmentsystem.movimiento (fecha,monto,tipo_mov,cta_nro_tarjeta) values (?, ?, 10, ?)";
        PreparedStatement stmt3 = con.obtenerConexion().prepareStatement(query3);
        stmt3.setDate(1, java.sql.Date.valueOf(date));
        stmt3.setInt(2, monto);
        stmt3.setString(3, nro_tarjeta);
        stmt3.executeUpdate();

        JOptionPane.showMessageDialog(null, "$" + monto + " retirados correctamente !");
    }

   public String[][] buscarTodosLosMovimientos(String nro_tarjeta) throws SQLException {
    String id_mov, fecha, monto, tipo_mov;
    int row = 0;
    int i = 0;
    

    String query = "Select * from bankmanagmentsystem.movimiento" + nro_tarjeta+";";
    PreparedStatement stmt = con.obtenerConexion().prepareStatement(query);
    ResultSet rs = stmt.executeQuery();

    while (rs.next()) {
        row++;
    }

    String query2 = "Select * from bankmanagmentsystem.movimiento" + nro_tarjeta+";";
    PreparedStatement stmt2 = con.obtenerConexion().prepareStatement(query2);
    ResultSet rs2 = stmt2.executeQuery();

    String[][] movimientos = new String[row][4];

    while (rs2.next()) {
        id_mov = String.valueOf(rs2.getInt("id_mov"));
        fecha = rs2.getString("fecha");
        monto = String.valueOf(rs2.getInt("monto"));
        tipo_mov = String.valueOf(rs2.getInt("tipo_mov"));

        movimientos[i][0] = id_mov;
        movimientos[i][1] = fecha;
        movimientos[i][2] = monto;
        movimientos[i][3] = tipo_mov;
        i++;
    }
    rs.close();
    stmt.close();
    rs2.close();
    stmt2.close();
    
    return movimientos;
}

}
