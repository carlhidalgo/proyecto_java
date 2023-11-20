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
    public boolean loginCuenta(String ctarjeta, String cpin){

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "select * from bankmanagmentsystem.cuenta where nro_tarjeta = '" + "ctarjeta" + "' and pin = '" + cpin + "';";
            try (PreparedStatement stmt = cnx.prepareStatement(query); //            stmt.setString(1, idUsuario);
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


   
}
