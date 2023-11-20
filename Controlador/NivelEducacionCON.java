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

/**
 *
 * @author carlos
 */
public class NivelEducacionCON {
    public NivelEducacionCON(Registrar2 registro2) {
        
    }
    
          // Métodos para acceder a la tabla Movimiento en la base de datos  

    public void selectNivelEducacional(String nivelEducacional) throws SQLException {
        
        Conexion cnx = new Conexion();
        String query = "select id_nEducacional FROM nivel_educacional where nombre_educacion = '" + nivelEducacional +"';";  
        ResultSet rs = cnx.Conn2(query);
        
    }
    
    
}
