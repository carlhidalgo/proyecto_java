/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import bd.Conexion;
import model.NivelEducacion;
import java.sql.Connection;
import java.sql.ResultSet;
import Vista.Registrar2;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/**
 *
 * @author carlos
 */
public class NivelEducacionCON {

    public NivelEducacion BuscarId(String nombreEducacion) {
        NivelEducacion educacion = new NivelEducacion();
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            String query = "select id_nEducacional FROM bankmanagmentsystem.nivel_educacional where nombre_educacion = '" + nombreEducacion + "';";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                educacion.setIdEducacion(rs.getInt("id_nEducacional") );
            }
            System.out.println(educacion);
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error SQL al buscar educacion por nombre" + e.getMessage());
        }
     return educacion;
    }

}
