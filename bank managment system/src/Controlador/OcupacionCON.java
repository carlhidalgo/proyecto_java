/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Registrar2;
import bd.Conexion;
import model.Movimiento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Ocupacion;


/**
 *
 * @author carlos
 */
public class OcupacionCON {
    public OcupacionCON(Registrar2 registro2) {
        }
        public void selectOcupacionCON(String nivelEducacional) throws SQLException {
        Conexion cnx = new Conexion();
        String query = "select id_ocupacion FROM nombre_ocupacion where nombre_educacion = '" + nivelEducacional +"';";  
        Ocupacion op = new Ocupacion();
        try {
            ResultSet rs = cnx.Conn2(query);
            if(rs.next()){
                op.setIdOcupacion(rs.getString("id_ocupacion"));   
            }
            else{
                System.out.println("no funciono");
            }
      
        } catch (SQLException ex) {
            
                System.out.println("problemas con la conexion");
        }
        }
} 

