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

/**
 *
 * @author carlos
 */
public class CuentaCON {
    
    Conexion cnx = new Conexion();
    
public void formCuenta(String tipoCuenta, String nivelEducacional, String ocupacion, String run,
            String numeroTarjeta, String numeroPin, boolean cuenta_ext,
            String cvv, String servicios) throws SQLException {

        String query = "update cliente SET c_id_nEducacional = (SELECT id_nEducacional FROM nivel_educacional where nombre_educacion = '" + nivelEducacional + "') WHERE run_cliente = '" + run + "';";
        String query2 = "update cliente SET c_id_ocupacion = (SELECT id_ocupacion FROM ocupacion where nombre_ocupacion = '" + ocupacion + "') WHERE run_cliente = '" + run + "';";
        String query3 = "update cliente SET cuenta_ext = " + cuenta_ext + " WHERE run_cliente = '" + run + "';";
        System.out.println(query);
        String query4 = "insert into cuenta values ('" + numeroTarjeta + "', '" + tipoCuenta + "', '"
                + numeroPin + "', " + 0 + ", '" + cvv + "', '" + servicios + "', true, '" + run + "');";
        cnx.Conn(query);
        cnx.Conn(query2);
        cnx.Conn(query3);
        cnx.Conn(query4);

    }

public void block(String nro_tarjeta, String cvv) throws SQLException {
        String getState = "SELECT estado from cuenta where nro_tarjeta = '" + nro_tarjeta + "';";
        ResultSet rs = cnx.Conn2(getState);
        if (rs.next()) { // BLOQUEAR
            String state = rs.getString("estado");
            if (state.equals("1")) {
                String query = "UPDATE cuenta SET estado = false where nro_tarjeta = '" + nro_tarjeta + "';";
                String cvvTest = "SELECT cvv FROM cuenta where nro_tarjeta = '" + nro_tarjeta + "';";
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
                String query = "UPDATE cuenta SET estado = true where nro_tarjeta = '" + nro_tarjeta + "';";
                String cvvTest = "SELECT cvv FROM cuenta where nro_tarjeta = '" + nro_tarjeta + "';";
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

 public void pinChange(String nro_tarjeta, String pinNumber, String pinNuevo) throws SQLException {
        String queryTest = "SELECT pin from cuenta where nro_tarjeta = '" + nro_tarjeta + "';";
        ResultSet rs = cnx.Conn2(queryTest);
        if (rs.next()) {
            String pinnywi = rs.getString("pin");
            if (!pinnywi.equals(pinNumber)) {
                JOptionPane.showMessageDialog(null, "PIN actual no coincide con el PIN registrado.");
            } else {
                String query = "update cuenta SET pin = '" + pinNuevo + "' where nro_tarjeta = '" + nro_tarjeta + "';";
                cnx.Conn(query);
                JOptionPane.showMessageDialog(null, "PIN cambiado exitosamente !!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número de tarjeta no registrado.");
        }
    }


}
