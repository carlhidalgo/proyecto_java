/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author carlos
 */
public class Movimiento {
    private String idMov;
    private Date fechaMov;
    // Otros atributos...

    // Constructor, getters y setters

    public Movimiento() {
    }

    public Movimiento(String idMov, Date fechaMov) {
        this.idMov = idMov;
        this.fechaMov = fechaMov;
    }

    public String getIdMov() {
        return idMov;
    }

    public void setIdMov(String idMov) {
        this.idMov = idMov;
    }

    public Date getFechaMov() {
        return fechaMov;
    }

    public void setFechaMov(Date fechaMov) {
        this.fechaMov = fechaMov;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "idMov=" + idMov + ", fechaMov=" + fechaMov + '}';
    }
    
}
