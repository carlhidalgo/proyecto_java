/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import model.Cuenta;
import bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author carlos
 */
public class CuentaCON {
    
    Conexion cnx = new Conexion();
    
public void formCuenta(String tipoCuenta, String nivelEducacional, String ocupacion, String run,
            String numeroTarjeta, String numeroPin, boolean cuenta_ext,
            String cvv, String servicios) throws SQLException {

        String query = "update bankmanagmentsystem.cliente SET c_id_nEducacional = (SELECT id_nEducacional FROM bankmanagmentsystem.nivel_educacional where nombre_educacion = '" + nivelEducacional + "') WHERE run_cliente = '" + run + "';";
        String query2 = "update bankmanagmentsystem.cliente SET c_id_ocupacion = (SELECT id_ocupacion FROM bankmanagmentsystem.ocupacion where nombre_ocupacion = '" + ocupacion + "') WHERE run_cliente = '" + run + "';";
        String query3 = "update bankmanagmentsystem.cliente SET cuenta_ext = " + cuenta_ext + " WHERE run_cliente = '" + run + "';";
        System.out.println(query);
        String query4 = "insert into cuenta values ('" + numeroTarjeta + "', '" + tipoCuenta + "', '"
                + numeroPin + "', " + 0 + ", '" + cvv + "', '" + servicios + "', true, '" + run + "');";
        cnx.Conn(query);
        cnx.Conn(query2);
        cnx.Conn(query3);
        cnx.Conn(query4);

    }

public void block(String nro_tarjeta, String cvv) throws SQLException {
        String getState = "SELECT estado from bankmanagmentsystem.cuenta where nro_tarjeta = '" + nro_tarjeta + "';";
        ResultSet rs = cnx.Conn2(getState);
        if (rs.next()) { // BLOQUEAR
            String state = rs.getString("estado");
            if (state.equals("1")) {
                String query = "UPDATE bankmanagmentsystem.cuenta SET estado = false where nro_tarjeta = '" + nro_tarjeta + "';";
                String cvvTest = "SELECT cvv FROM bankmanagmentsystem.cuenta where nro_tarjeta = '" + nro_tarjeta + "';";
                ResultSet rs1 = cnx.Conn2(cvvTest);
                if (rs1.next()) {
                    String cvvString = rs1.getString("cvv");
                    if (cvvString.equals(cvv)) {
                        cnx.Conn(query);
                        JOptionPane.showMessageDialog(null, "Cuenta bloqueada exitosamente !");
                    } else {
                        JOptionPane.showMessageDialog(null, "CVV ingresado no aparece. Revise la parte posterior de su tarjeta.");
                    }
                }
            } else { // DESBLOQUEAR
                String query = "UPDATE bankmanagmentsystem.cuenta SET estado = true where nro_tarjeta = '" + nro_tarjeta + "';";
                String cvvTest = "SELECT cvv FROM bankmanagmentsystem.cuenta where nro_tarjeta = '" + nro_tarjeta + "';";
                ResultSet rs1 = cnx.Conn2(cvvTest);
                if (rs1.next()) {
                    String cvvString = rs1.getString("cvv");
                    if (cvvString.equals(cvv)) {
                        cnx.Conn(query);
                        JOptionPane.showMessageDialog(null, "Cuenta desbloqueada exitosamente !");
                    } else {
                        JOptionPane.showMessageDialog(null, "CVV ingresado no aparece. Revise la parte posterior de su tarjeta.");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de tarjeta no registrado.");
        }
    }

public void pinChange(String nro_tarjeta, String pinNumber, String pinNuevo) {
    Cuenta cuenta = new Cuenta();
    
    try { 
//////        Conexion conector = new Conexion();
        Connection  conct = cnx.Conn(pinNuevo);
        
        String queryTest = "SELECT pin FROM bankmanagmentsystem.cuenta WHERE nro_tarjeta = ?";
        PreparedStatement stmt = cnx.prepareStatement(queryTest);
        stmt.setString(1, nro_tarjeta);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            cuenta.setPinNumber(rs.getString("pin"));

            if (!pinNumber.equals(cuenta.getPinNumber())) {
                JOptionPane.showMessageDialog(null, "PIN actual no coincide con el PIN registrado.");
            } else {
                String updateQuery = "UPDATE bankmanagmentsystem.cuenta SET pin = ? WHERE nro_tarjeta = ?";
                PreparedStatement updateStmt = cnx.prepareStatement(updateQuery);
                updateStmt.setString(1, pinNuevo);
                updateStmt.setString(2, nro_tarjeta);
                updateStmt.executeUpdate();

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
                JOptionPane.showMessageDialog(null, "PIN cambiado exitosamente!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de tarjeta no registrado.");
        }
    } catch (SQLException e) {
        System.out.println("Error SQL al agregar libro " + e.getMessage());
        e.printStackTrace();
    }

}

// public void pinChange(String nro_tarjeta, String pinNumber, String pinNuevo) throws SQLException {
//     Cuenta cuenta = new Cuenta();   
//     try {
//     
//     String queryTest = "SELECT pin from cuenta where nro_tarjeta = '" + nro_tarjeta + "';";
//     PreparedStatement stmt = cnx.prepareStatement(query)   
//     ResultSet rs = cnx.Conn2(queryTest);
//        if (rs.next()) {
//            cuenta.setPinNumber( rs.getString("pin"));
//            if (pinNumber.equals) {
//                JOptionPane.showMessageDialog(null, "PIN actual no coincide con el PIN registrado.");
//            } else {
//                String query = "update cuenta SET pin = '" + pinNuevo + "' where nro_tarjeta = '" + nro_tarjeta + "';";
//                cnx.Conn(query);
//                JOptionPane.showMessageDialog(null, "PIN cambiado exitosamente !!");
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Número de tarjeta no registrado.");
//            }
//        }
//    }
        public String[][] cartola(String nro_tarjeta) throws SQLException {
        String id_mov,fecha ,monto,tipo_mov;
        int row = 0;
        int i=0;
        String query = "Select * from bankmanagmentsystem.movimiento where cta_nro_tarjeta = '" + nro_tarjeta + "';";
        ResultSet rs = cnx.Conn2(query);

        if (rs.next()) {
            row++;
        }
        
        String query2 = "Select * from bankmanagmentsystem.movimiento where cta_nro_tarjeta = '" + nro_tarjeta + "';";
        ResultSet rs2 = cnx.Conn2(query2);
        
        String[][] cartola = new String[row][4];
        
        while (rs2.next()) {
            int id_movInt = rs.getInt("id_mov");
            System.out.println(id_movInt);
            id_mov = String.valueOf(id_movInt);
            System.out.println(id_mov);
            fecha = rs.getString("fecha");

            int montoInt = rs.getInt("monto");
            monto = String.valueOf(montoInt);

            int tipo_movString = rs.getInt("tipo_mov");
            tipo_mov = String.valueOf(tipo_movString);
            
            cartola[i][0] = id_mov;
            cartola[i][1] = fecha;
            cartola[i][2] = monto;
            cartola[i][3] = tipo_mov;
            i++;
        }
        return cartola;
    }
    
}
