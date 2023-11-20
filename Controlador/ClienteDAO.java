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
   
public boolean agregar(Cliente cliente) throws SQLException {
    try {
         Conexion con = new Conexion();
         Connection cnx = con.obtenerConexion();
         
            String query = "insert into bankmanagmentsystem.cliente (run_cliente,nombre_cliente,genero_cliente,direccion_cliente,email_cliente,eCivil_cliente,fNacimiento_cliente,sueldo_cliente,c_id_nEducacional,c_id_ciudad,c_id_ocupacion) values (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, cliente.getRun());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getGenero());
            stmt.setString(4, cliente.getDireccion());
            stmt.setString(5, cliente.getEmail());
            stmt.setString(6, cliente.geteCivil());
            stmt.setString(7, cliente.getfNacimiento());
            stmt.setInt(8, cliente.getSueldo());
            stmt.setInt(9, cliente.getC_id_nEducacional());
            stmt.setInt(10, cliente.getC_id_ciudad());
            stmt.setInt(11, cliente.getC_id_ocupacion());
            stmt.executeUpdate();

            stmt.close();
            cnx.close();
            return true;
        }
     catch (SQLException e) {
            System.out.println("Error SQL al agregar libro " + e.getMessage());
            return false;
    
}
    
}}




