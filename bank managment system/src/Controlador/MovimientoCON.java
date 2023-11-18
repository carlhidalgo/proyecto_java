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

/**
 *
 * @author carlos
 */
public class MovimientoCON {
    
    Conexion cnx = new Conexion();
    
    public void deposit(String pinNumber, int number, String nro_tarjeta) throws SQLException {
        int saldo;
        LocalDate date = LocalDate.now();
        System.out.println(date);
        String query = "SELECT saldo FROM cuenta where pin = '" + pinNumber + "';";
        ResultSet rs = cnx.Conn2(query);
        if (rs.next()) {
            saldo = Integer.parseInt(rs.getString("saldo"));
        } else {
            JOptionPane.showMessageDialog(null, "Número PIN no registrado. ");
            return;
        }
        int monto = number;
        saldo = saldo + number;
        String query2 = "UPDATE cuenta SET saldo = " + number + " WHERE pin = '" + pinNumber + "'";
        System.out.println(query2);
        cnx.Conn(query2);
        String query3 = "INSERT INTO movimiento (fecha,monto,tipo_mov,cta_nro_tarjeta) values ('"
                + date + "', " + monto + ", 5, '" + nro_tarjeta + "');";
        System.out.println(query3);
        cnx.Conn(query3);
        JOptionPane.showMessageDialog(null, "$" + monto + " depositados correctamente !");

    }
    public void withdrawal(String pinNumber, int number, String nro_tarjeta) throws SQLException {
        int saldo;
        LocalDate date = LocalDate.now();
        System.out.println(date);
        String query = "SELECT saldo FROM cuenta where pin = '" + pinNumber + "';";
        ResultSet rs = cnx.Conn2(query);
        if (rs.next()) {
            saldo = Integer.parseInt(rs.getString("saldo"));
        } else {
            JOptionPane.showMessageDialog(null, "Número PIN no registrado. ");
            return;
        }
        int monto = number;
        saldo = saldo - number;
        String query2 = "UPDATE cuenta SET saldo = " + number + " WHERE pin = '" + pinNumber + "'";
        System.out.println(query2);
        cnx.Conn(query2);
        String query3 = "INSERT INTO movimiento (fecha,monto,tipo_mov,cta_nro_tarjeta) values ('"
                + date + "', " + monto + ", 10, '" + nro_tarjeta + "');";
        System.out.println(query3);
        cnx.Conn(query3);
        JOptionPane.showMessageDialog(null, "$" + monto + " retirados correctamente !");
    }

public String balance(String nro_tarjeta) throws SQLException {
        String query = "Select saldo from cuenta where nro_tarjeta = '" + nro_tarjeta + "';";
        ResultSet rs = cnx.Conn2(query);
        if (rs.next()) {
            int saldo = rs.getInt("saldo");
            return String.valueOf(saldo);
        } else {
            return null;
        }

    }

public void cartola(String nro_tarjeta) throws SQLException {
        Movimiento movimiento = new Movimiento();
        String query = "Select * from movimiento where cta_nro_tarjeta = '" + nro_tarjeta
                + "' AND extract(MONTH FROM fecha) = 11";
        ResultSet rs = cnx.Conn2(query);
        while (true) {
            if (rs.next()) {
                int id_movInt = rs.getInt("id_mov");
                String id_mov = String.valueOf(id_movInt);

                String fecha = rs.getString("fecha");

                int montoInt = rs.getInt("monto");
                String monto = String.valueOf(montoInt);

                int tipo_movString = rs.getInt("tipo_mov");
                String tipo_mov = String.valueOf(tipo_movString);

                movimiento.guardar(id_mov, fecha, monto, tipo_mov);
            } else {
                break;
            }
        }

    }

}
