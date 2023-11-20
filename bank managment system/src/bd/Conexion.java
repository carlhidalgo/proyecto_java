/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexion {
    protected Connection c;
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private String DB_URL = "jdbc:mysql://database-proyect.cawe9uct7p6h.us-east-1.rds.amazonaws.com:3306/bankmanagmentsystem";
    //credenciales 
    private final String usuario = "admin";
    private final String contraseña = "Planetarock2010.";


//        }
//        
//    }
   public Connection obtenerConexion() throws SQLException {
        Connection connection = null;
        try {
            Class.forName(JDBC_DRIVER);
            c = DriverManager.getConnection(DB_URL, usuario, contraseña);
            System.out.println("Conexión exitosa");
            return c;
        } catch (SQLException e) {
            System.out.println("Error de conexión" + e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }
}
    
    
