/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlos
 */
public class Cliente {
    private String idCliente;
    private String rutCliente;
    // Otros atributos...

    // Constructor, getters y setters

    public Cliente() {
    }

    public Cliente(String idCliente, String rutCliente) {
        this.idCliente = idCliente;
        this.rutCliente = rutCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", rutCliente=" + rutCliente + '}';
    }
    
    
}
