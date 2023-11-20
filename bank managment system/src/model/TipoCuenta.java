/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlos
 */
public class TipoCuenta {
    
    private int idTipoCuenta;
    private String nombreCuenta;

    // Constructor, getters y setters

    public TipoCuenta() {
    }

    public TipoCuenta(int idTipoCuenta, String nombreCuenta) {
        this.idTipoCuenta = idTipoCuenta;
        this.nombreCuenta = nombreCuenta;
    }

    public int getIdTipoCuenta() {
        return idTipoCuenta;
    }

    public void setIdTipoCuenta(int idTipoCuenta) {
        this.idTipoCuenta = idTipoCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    @Override
    public String toString() {
        return "TipoCuenta{" + "idTipoCuenta=" + idTipoCuenta + ", nombreCuenta=" + nombreCuenta + '}';
    }

    
    
}
