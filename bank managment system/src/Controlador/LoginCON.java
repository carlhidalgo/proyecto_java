/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.Login1;
import bd.Conexion;
import model.Cuenta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;




/**
 *
 * @author carlos
 */
public class LoginCON {
    
    // Métodos para acceder 

    public LoginCON(Login1 login1) {
        
    }
    
public static boolean loginUser(String ctarjeta, String cpin) {
        Conexion cnx = new Conexion();
        String query = "select * from bankmanagmentsystem.cuenta where nro_tarjeta = '" + ctarjeta + "' and pin = '" + cpin + "';";

        try {
            ResultSet rs = cnx.Conn2(query);
            if (rs.next()) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Número de tarjeta o pin incorrecto. ");
                return false;
            }
        } catch (SQLException ex) {
            
            return false;
        }
    }
                                                                                                    
// Método para verificar la existencia de un cliente en la base de datos
    
    


    
 


}
    
