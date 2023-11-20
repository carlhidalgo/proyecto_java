/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Registrar2;
import bd.Conexion;
import model.Movimiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Ocupacion;


/**
 *
 * @author carlos
 */
public class OcupacionCON {
    public OcupacionCON() {
        }


        
//public int BuscarId(String nivelOcupacional) {
//        //trycatch+tab
//        Ocupacion ocupacion = new Ocupacion();
//
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexion();
//
//            String query = "select id_ocupacion FROM bankmanagmentsystem.nombre_ocupacion where nombre_ocupacion = '" + nivelOcupacional +"';";  
//            PreparedStatement stmt = cnx.prepareStatement(query);
////            stmt.setString(2, nivelEducacional);
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                 ocupacion.setIdOcupacion(rs.getInt("id_ocupacion"));
//                 ocupacion.setNombre(rs.getString("nombre_ocupacion"));
//         
//            }
//            rs.close();
//            stmt.close();
//            cnx.close();
//
//        } catch (SQLException e) {
//            System.out.println("Error SQL al listar libro por Id" + e.getMessage());
//            
//        }
//        return ocupacion.getIdOcupacion();
//    }  

public int BuscarId(String nivelOcupacional) {
        Ocupacion ocupacion = new Ocupacion();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "select id_ocupacion FROM bankmanagmentsystem.ocupacion where nombre_ocupacion = '" + nivelOcupacional +"';";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                 ocupacion.setIdOcupacion(rs.getInt("id_ocupacion"));
            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al buscar ocupacion por nombre" + e.getMessage());
        }
        return ocupacion.getIdOcupacion();
    }
        
} 

