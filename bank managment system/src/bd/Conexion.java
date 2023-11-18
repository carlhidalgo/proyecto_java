/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {

    Connection c;
    Statement s;
    String usuario = "admin";
    String contraseña = "Planetarock2010.";
   
   public void Conn(String query) throws SQLException {
        try {
            c = DriverManager.getConnection("jdbc:mysql://database-proyect.cawe9uct7p6h.us-east-1.rds.amazonaws.com:3306/bankmanagmentsystem", usuario, contraseña);
            s = c.createStatement();
            s.executeUpdate(query);
            System.out.println("SUCCESFULLY CONNECTED!");
        } catch (SQLException ex) {
            System.out.println("CAN'T CONNECT.");
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public ResultSet Conn2(String query) throws SQLException {
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagmentsystem", usuario, contraseña);
        s = c.createStatement();
        return s.executeQuery(query);
    }

    public void rollback() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


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
//
//        public boolean agregar(Cliente cliente) {
//        Date fechaNacimiento;
//
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexionOracle();
//
//            fechaNacimiento = cliente.getFechaNacimiento();
//
//            // Verificar si el RUN y el número de tarjeta ya existen en la base de datos
//
//
//            // Si no existe, proceder con la inserción
//            String query = "INSERT INTO cliente(id_cliente, nombre_cliente, rut_cliente, DVRUT_CLIENTE, genero_cliente, direccion_cliente, email_cliente, ecivil_cliente, sueldo_cliente) VALUES(?,?,?,?,?,?,?,?,?)";
//            try (PreparedStatement stmt = cnx.prepareStatement(query)) {
//                stmt.setInt(1, cliente.getIdCliente());
//                stmt.setString(2, cliente.getRutCliente());
//                stmt.setString(3, cliente.getDvrutCliente());
//                stmt.setString(4, cliente.getNombreCliente());
//                stmt.setString(5, cliente.getGeneroCliente());
//                stmt.setString(6, cliente.getDireccionCliente());
//                stmt.setString(7, cliente.getEmailCliente());
//                stmt.setString(8, cliente.getEcivilCliente());
//                stmt.setInt(9, cliente.getSueldoCliente());
////                stmt.setInt(10, '1');
//            //    stmt.setDate(13, new java.sql.Date(cliente.getFechaNacimiento()));
//
//                // Realizar la inserción
//                stmt.executeUpdate();
//
//                System.out.println("Cliente agregado con éxito.");
//                return true; // Indicar que el cliente se ha agregado correctamente
//            }
//        } catch (SQLException e) {
//            System.out.println("Error SQL al agregar cliente: " + e.getMessage());
//            return false;
//        } catch (Exception e) {
//            System.out.println("Error al obtener la conexión: " + e.getMessage());
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//        // Crear un objeto Cliente con datos de prueba
//        Cliente clientePrueba = new Cliente();
//        clientePrueba.setIdCliente(1);
//        clientePrueba.setNombreCliente("John Doe");
//        clientePrueba.setRutCliente("12345678");
//        clientePrueba.setDvrutCliente("1");
//        clientePrueba.setGeneroCliente("Masculino");
//        clientePrueba.setDireccionCliente("Calle Principal 123");
//        clientePrueba.setEmailCliente("john.doe@example.com");
//        clientePrueba.setEcivilCliente("Soltero");
//        clientePrueba.setSueldoCliente(50000);
//     //   clientePrueba.setFechaNacimiento(new Date());
//
//        // Crear un objeto Conexion y llamar al método agregar para la prueba
//        Conexion conexion = new Conexion();
//        try {
//            conexion.agregar(clientePrueba);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//}
    
//public boolean agregar(Cliente cliente) {
//    Date fechaNacimiento;
//
//    try {
//        Conexion con = new Conexion();
//        Connection cnx = con.obtenerConexionOracle();
//Ciudad ciudad = new Ciudad();
//    NivelEducacion educacion = new NivelEducacion();
//    Ocupacion ocupacion = new Ocupacion();
//        fechaNacimiento = cliente.getFechaNacimiento();
//
//        // Si no existe, proceder con la inserción
//        String query = "INSERT INTO cliente(id_cliente, nombre_cliente, rut_cliente, DVRUT_CLIENTE, genero_cliente, direccion_cliente, email_cliente, ecivil_cliente, sueldo_cliente, CIUDAD_ID_CIUDAD, OCUPACION_ID_OCUPACION, NIVEL_EDUCACION_ID_EDUCACION, FECHANACIMIENTO) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
//        try (PreparedStatement stmt = cnx.prepareStatement(query)) {
//            stmt.setInt(1, cliente.getIdCliente());
//            stmt.setString(2, cliente.getNombreCliente());
//            stmt.setString(3, cliente.getRutCliente());
//            stmt.setString(4, cliente.getDvrutCliente());
//            stmt.setString(5, cliente.getGeneroCliente());
//            stmt.setString(6, cliente.getDireccionCliente());
//            stmt.setString(7, cliente.getEmailCliente());
//            stmt.setString(8, cliente.getEcivilCliente());
//            stmt.setInt(9, cliente.getSueldoCliente());
//            stmt.setString(10, ciudad.getIdCiudad());
//            stmt.setString(11, ocupacion.getIdOcupacion());
//            stmt.setString(12, educacion.getIdEducacion());
//            stmt.setDate(13, new java.sql.Date(fechaNacimiento.getTime()));
//
//            // Realizar la inserción
//            stmt.executeUpdate();
//
//            System.out.println("Cliente agregado con éxito.");
//            return true; // Indicar que el cliente se ha agregado correctamente
//        }
//    } catch (SQLException e) {
//        System.out.println("Error SQL al agregar cliente: " + e.getMessage());
//        return false;
//    } catch (Exception e) {
//        System.out.println("Error al obtener la conexión: " + e.getMessage());
//        return false;
//    }
//}
//
//public static void main(String[] args) {
//    // Crear un objeto Cliente con datos de prueba
//    Cliente clientePrueba = new Cliente();
//    Ciudad ciudad = new Ciudad();
//    NivelEducacion educacion = new NivelEducacion();
//    Ocupacion ocupacion = new Ocupacion();
//    
//    clientePrueba.setIdCliente(1);
//    clientePrueba.setNombreCliente("John Doe");
//    clientePrueba.setRutCliente("12345678");
//    clientePrueba.setDvrutCliente("1");
//    clientePrueba.setGeneroCliente("Masculino");
//    clientePrueba.setDireccionCliente("Calle Principal 123");
//    clientePrueba.setEmailCliente("john.doe@example.com");
//    clientePrueba.setEcivilCliente("Soltero");
//    clientePrueba.setSueldoCliente(50000);
//    ciudad.setIdCiudad("12345"); // Ajusta este valor según tu lógica de negocio
//    ocupacion.setIdOcupacion("1"); // Ajusta este valor según tu lógica de negocio
//    educacion.setIdEducacion("1"); // Ajusta este valor según tu lógica de negocio
//    clientePrueba.setFechaNacimiento(new Date()); // Ajusta la fecha de nacimiento
//
//    // Crear un objeto Conexion y llamar al método agregar para la prueba
//    Conexion conexion = new Conexion();
//    try {
//        conexion.agregar(clientePrueba);
//        
//    } catch (Exception e) {
//    }
//}
//    Cliente cliente = new Cliente();
//    Ciudad ciudad = new Ciudad();
//    NivelEducacion educacion = new NivelEducacion();
//    Ocupacion ocupacion = new Ocupacion();
//    
//public boolean agregar(Cliente cliente) {
//    Date fechaNacimiento;
//
//    try {
//        Conexion con = new Conexion();
//        Connection cnx = con.obtenerConexionOracle();
//        fechaNacimiento = cliente.getFechaNacimiento();
//        
//        // Si no existe, proceder con la inserción
//        String query = "INSERT INTO cliente(id_cliente, nombre_cliente, rut_cliente, DVRUT_CLIENTE, genero_cliente, direccion_cliente, email_cliente, ecivil_cliente, sueldo_cliente, CIUDAD_ID_CIUDAD, OCUPACION_ID_OCUPACION, NIVEL_EDUCACION_ID_EDUCACION, FECHANACIMIENTO) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
//        try (PreparedStatement stmt = cnx.prepareStatement(query)) {
//            stmt.setInt(1, cliente.getIdCliente());
//            stmt.setString(2, cliente.getNombreCliente());
//            stmt.setString(3, cliente.getRutCliente());
//            stmt.setString(4, cliente.getDvrutCliente());
//            stmt.setString(5, cliente.getGeneroCliente());
//            stmt.setString(6, cliente.getDireccionCliente());
//            stmt.setString(7, cliente.getEmailCliente());
//            stmt.setString(8, cliente.getEcivilCliente());
//            stmt.setInt(9, cliente.getSueldoCliente());
//            stmt.setString(10, cliente.getIdCiudad());  // Ajustado para obtener la ID de Ciudad desde el objeto cliente
//            stmt.setString(11, cliente.getIdOcupacion());  // Ajustado para obtener la ID de Ocupacion desde el objeto cliente
//            stmt.setString(12, cliente.getIdEducacion());  // Ajustado para obtener la ID de Educacion desde el objeto cliente
//            stmt.setDate(13, new java.sql.Date(fechaNacimiento.getTime()));
//
//            // Realizar la inserción
//            stmt.executeUpdate();
//
//            System.out.println("Cliente agregado con éxito.");
//            return true; // Indicar que el cliente se ha agregado correctamente
//        }
//    } catch (SQLException e) {
//        System.out.println("Error SQL al agregar cliente: " + e.getMessage());
//        return false;
//    } catch (Exception e) {
//        System.out.println("Error al obtener la conexión: " + e.getMessage());
//        return false;
//    }
//}
//
//public static void main(String[] args) {
//    // Crear un objeto Cliente con datos de prueba
//    Cliente clientePrueba = new Cliente();
//    Ciudad ciudad = new Ciudad();
//    NivelEducacion educacion = new NivelEducacion();
//    Ocupacion ocupacion = new Ocupacion();
//    
//    clientePrueba.setIdCliente(1);
//    clientePrueba.setNombreCliente("John Doe");
//    clientePrueba.setRutCliente("12345678");
//    clientePrueba.setDvrutCliente("1");
//    clientePrueba.setGeneroCliente("Masculino");
//    clientePrueba.setDireccionCliente("Calle Principal 123");
//    clientePrueba.setEmailCliente("john.doe@example.com");
//    clientePrueba.setEcivilCliente("Soltero");
//    clientePrueba.setSueldoCliente(50000);
//    
//    ciudad.setIdCiudad("12345");
//    ocupacion.setIdOcupacion("1");
//    educacion.setIdEducacion("1");
//    
//    ciudad.setCiudad(ciudad);  // Añadido para establecer la Ciudad en el objeto cliente
//    ocupacion.setOcupacion(ocupacion);  // Añadido para establecer la Ocupacion en el objeto cliente
//    educacion.setNivelEducacion(educacion);  // Añadido para establecer el Nivel de Educacion en el objeto cliente
//    
//    clientePrueba.setFechaNacimiento(new Date()); // Ajusta la fecha de nacimiento
//
//    // Crear un objeto Conexion y llamar al método agregar para la prueba
//    Conexion conexion = new Conexion();
//    try {
//        conexion.agregar(clientePrueba);
//    } catch (Exception e) {
//    }
//}
//}