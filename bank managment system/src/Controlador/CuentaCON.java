/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import model.Cuenta;
import bd.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import model.Cliente;
/**
 *
 * @author carlos
 */
public class CuentaCON {
    
// Métodos para acceder a la tabla Movimiento en la base de datos
     // Método para verificar la existencia de un cliente en la base de datos
    private boolean verificarExistenciaCliente(Connection cnx, String run, String numeroTarjeta) throws SQLException {
        String query = "SELECT COUNT(*) AS count FROM cliente WHERE run = ? AND numero_tarjeta = ?";
        try (PreparedStatement stmt = cnx.prepareStatement(query)) {
            stmt.setString(1, run);
            stmt.setString(2, numeroTarjeta);

            ResultSet rs = stmt.executeQuery();
            rs.next();
            int count = rs.getInt("count");

            return count > 0;
        }
    }

 public boolean agregar(Cliente cliente) throws Exception {
    Date date;

    try {
        Conexion con = new Conexion();
        Connection cnx = con.obtenerConexionOracle();

        date = Cliente.getFechaNacimiento();

        // Verificar si el RUN y el número de tarjeta ya existen en la base de datos
        if (verificarExistenciaCliente(cnx, cliente.getRun(), cliente.getNumeroTarjeta())) {
            System.out.println("Ya existe un cliente con este RUN y número de tarjeta.");
            return false; // Indicar que no se puede agregar el cliente
        }

        // Si no existe, proceder con la inserción
        String query = "insert into cliente(nombre, run, numero_tarjeta, genero, direccion, email, estado_civil, fecha_nacimiento, ciudad, sueldo) values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = cnx.prepareStatement(query);
        stmt.setString(1, cliente.getNombre());
        stmt.setString(2, cliente.getRun());
        stmt.setString(3, cliente.getNumeroTarjeta());
        stmt.setString(4, cliente.getGenero());
        stmt.setString(5, cliente.getDireccion());
        stmt.setString(6, cliente.getEmail());
        stmt.setString(7, cliente.getEstadoCivil());
        stmt.setDate(8, new java.sql.Date(date.getTime()));
        stmt.setString(9, cliente.getCiudad());
        stmt.setInt(10, cliente.getSueldo());

        stmt.executeUpdate();
        stmt.close();
        cnx.close();
        return true; // Indicar que el cliente se ha agregado correctamente

    } catch (SQLException e) {
        System.out.println("Error SQL al agregar cliente " + e.getMessage());
        return false;
    }
}



}
