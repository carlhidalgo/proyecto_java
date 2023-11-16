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
    private int idCuenta;
    private String numeroTarjeta;
    private String pin;
    private Integer saldo;
    private String cvv;
    
    // Otros atributos...

    // Constructor, getters y setters

    public Cuenta() {
    }

    public Cuenta(int idCuenta, String numeroTarjeta, String pin, Integer saldo, String cvv) {
        this.idCuenta = idCuenta;
        this.numeroTarjeta = numeroTarjeta;
        this.pin = pin;
        this.saldo = saldo;
        this.cvv = cvv;
    }

    
    
    
    
    
    
    
//    getter y setter

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "idCuenta=" + idCuenta + ", numeroTarjeta=" + numeroTarjeta + ", pin=" + pin + ", saldo=" + saldo + ", cvv=" + cvv + '}';
    }
   


    
}
