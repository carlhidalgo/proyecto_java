/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import java.util.Properties;
/**
 *
 * @author carlos
 */
public class Conexion {
    
    // DE ACA COMIENZA LA CONEXION A ORACLE
    private static final String WALLET_PATH = "C:/Users/Felipe/Documents/Wallet_proyect";
    private static final String WALLET_PASSWORD = "Planetarock2010.";
    private static final String JDBC_URL = "jdbc:oracle:thin:@proyect_high"; // - REEMPLAZA 'testdb_high' EN EL ARCHIVO TNSNAMES.ORA APARECE AL INICIO [NOMBRE DE LA DB]_HIGH";

    public Connection obtenerConexionOracle() throws Exception {
        // Configuración del wallet
        String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
        String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();

        System.setProperty("oracle.net.tns_admin", WALLET_PATH);
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
        System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);

        Properties properties = new Properties();
        properties.put("user", "admin");
        properties.put("password", WALLET_PASSWORD);

        return DriverManager.getConnection(JDBC_URL, properties);
    }
    // ------- * --------
    

//    public Connection obtenerConexion() {
//        Connection connection = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/libreria", "root", "");
//            System.out.println("Conexión exitosa");
//        } catch (SQLException e) {
//            System.out.println("Error de conexión" + e.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
//        return connection;
//    }
//    
}
