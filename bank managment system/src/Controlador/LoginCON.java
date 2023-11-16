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




/**
 *
 * @author carlos
 */
public class LoginCON {
    
    // Métodos para acceder 

    public LoginCON(Login1 login1) {
        
    }
    


// Método para verificar la existencia de un cliente en la base de datos
public Cuenta verificarCredenciales(String pin,String numeroTarjeta) throws Exception {
    Cuenta cuenta = new Cuenta();
    
    try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexionOracle();
            String query = "SELECT  FROM cliente WHERE pin = ? AND numero_tarjeta = ?";
            
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(2, pin);
            stmt.setString(3, numeroTarjeta);
            
            ResultSet rs = stmt.executeQuery();
             
                
                if(rs.next()) {
                    
                 cuenta.setIdCuenta(rs.getInt("id_cuenta"));
                 cuenta.setNumeroTarjeta(rs.getString("numero_tarjeta"));
                 cuenta.setPin(rs.getString("pin"));
                 cuenta.setSaldo(rs.getInt("saldo"));
                 cuenta.setCvv(rs.getString("cvv"));
                    
                 
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e)  {
            // Manejo de excepciones
            System.out.println("Error sql al verificar credenciales: " + e.getMessage());
            
        }
        return cuenta;
    }

    // Método 

 


}
    
