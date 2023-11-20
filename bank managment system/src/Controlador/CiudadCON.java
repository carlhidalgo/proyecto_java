/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Ciudad;


/**
 *
 * @author gauge
 */
public class CiudadCON {
    public CiudadCON() {
        }

public Ciudad BuscarId(String ciudad) {
        Ciudad ciudad2 = new Ciudad();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "select id_ciudad FROM bankmanagmentsystem.ciudad where nombre_ciudad = '" + ciudad +"';";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                 ciudad2.setId_Ciudad(rs.getInt("id_ciudad"));
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al buscar ocupacion por nombre" + e.getMessage());
        }
        return ciudad2;
    }    
}
