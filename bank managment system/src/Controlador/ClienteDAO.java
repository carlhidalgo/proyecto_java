/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Cliente;

import javax.swing.JOptionPane;

import java.sql.SQLException;
import java.util.Date;
/**
 *
 * @author carlos
 */



public class ClienteDAO {
   
public boolean agregar(String run, String name, char dv_run, String genero, String direccion, String email,
        String eCivil, String fNacimiento, int sueldo,boolean cuenta_ext ,String ciudad) throws SQLException {
    try {
         Conexion con = new Conexion();
         Connection cnx = con.obtenerConexion();


        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo nombre es obligatorio.");
        } else {
            String query = "insert into bankmanagmentsystem.cliente (run_cliente,nombre_cliente,dv_run,genero_cliente,direccion_cliente,email_cliente,eCivil_cliente,fNacimiento_cliente,sueldo_cliente) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, run);
            stmt.setString(2, name);
            stmt.setString(3, String.valueOf(dv_run));
            stmt.setString(4, genero);
            stmt.setString(5, direccion);
            stmt.setString(6, email);
            stmt.setString(7, eCivil);
            stmt.setString(8, fNacimiento);
            stmt.setInt(9, sueldo);
            stmt.setString(10, ciudad);
            stmt.setString(11, ciudad);
            stmt.setString(12, ciudad);
            stmt.setString(13, ciudad);
            stmt.executeUpdate();

            stmt.close();
            cnx.close();
        }
    } catch (SQLException e) {
        System.out.println("Error SQL al insertar cliente" + e.getMessage());
    }
}
    
}




