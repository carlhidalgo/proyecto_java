/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlos
 */
public class Cuenta {
    private String idCuenta;
    private String numeroTarjeta;
    // Otros atributos...

    // Constructor, getters y setters

    public Cuenta() {
    }
//metodo contructor con parametros
    public Cuenta(String idCuenta, String numeroTarjeta) {
        this.idCuenta = idCuenta;
        this.numeroTarjeta = numeroTarjeta;
    }
    
//    getter y setter

    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "idCuenta=" + idCuenta + ", numeroTarjeta=" + numeroTarjeta + '}';
    }
    
}
