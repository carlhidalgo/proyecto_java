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

public void BuscarId(String ocupacion) {
        Ocupacion ocupacion2 = new Ocupacion();

        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "select id_ocupacion FROM bankmanagmentsystem.ocupacion where nombre_ocupacion = '" + ocupacion +"';";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                 ocupacion2.setIdOcupacion(rs.getInt("id_ocupacion"));
            }
            rs.close();
            stmt.close();
            cnx.close();
            System.out.println(ocupacion2.getIdOcupacion());
        } catch (SQLException e) {
            System.out.println("Error SQL al buscar ocupacion por nombre" + e.getMessage());
        }
        
    }

public void insertocupacion(String ocupacion, int idOcupacion) {
    try {
        // 1. Establish a connection
        Conexion con = new Conexion();
        Connection cnx = con.obtenerConexion();

        // 2. Create a SQL INSERT query
        String query = "INSERT INTO bankmanagmentsystem.ocupacion (nombre_ocupacion, id_ocupacion) VALUES (?, ?)";

        // 3. Prepare the statement
        PreparedStatement stmt = cnx.prepareStatement(query);

        // 4. Set the parameters in the query
        stmt.setString(1, ocupacion);
        stmt.setInt(2, idOcupacion);

        // 5. Execute the query
        stmt.executeUpdate();

        // 6. Close the connection
        stmt.close();
        cnx.close();
    } catch (SQLException e) {
        System.out.println("Error SQL al insertar datos: " + e.getMessage());
    }
}



} 

