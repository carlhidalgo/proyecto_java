/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import bd.Conexion;
import model.Cliente;

import javax.swing.JOptionPane;

import java.sql.SQLException;
/**
 *
 * @author carlos
 */



public class ClienteCON {
   
    Conexion cnx = new Conexion();
    
    public void formCliente(String run, String name, char dv_run, String genero, String direccion, String email,
            String eCivil, String fNacimiento, int sueldo, String ciudad) throws SQLException {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo nombre es obligatorio.");
        } else {
            String query = "insert into cliente (run_cliente,nombre_cliente,dv_run,genero_cliente,direccion_cliente,email_cliente,eCivil_cliente,fNacimiento_cliente,sueldo_cliente) values ('"
                    + run + "', '" + name + "', '" + dv_run + "', '" + genero + "', '" + direccion + "', '" + email + "', '" + eCivil
                    + "', '" + fNacimiento + "', " + sueldo + ");";
            cnx.Conn(query);
            System.out.println(query);
            String query2 = "update cliente SET c_id_ciudad = (SELECT id_ciudad FROM ciudad where nombre_ciudad = '" + ciudad + "') WHERE run_cliente = '" + run + "';";
            cnx.Conn(query2);
        }
    }

    
}




