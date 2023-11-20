/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlos
 */
public class NivelEducacion {
    private String idEducacion;
    private String nombreEducacion;

    // Constructor, getters y setters

    public NivelEducacion() {
    }

    public NivelEducacion(String idEducacion, String nombreEducacion) {
        this.idEducacion = idEducacion;
        this.nombreEducacion = nombreEducacion;
    }

    public String getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(String idEducacion) {
        this.idEducacion = idEducacion;
    }

    public String getNombreEducacion() {
        return nombreEducacion;
    }

    public void setNombreEducacion(String nombreEducacion) {
        this.nombreEducacion = nombreEducacion;
    }

    @Override
    public String toString() {
        return "NivelEducacion{" + "idEducacion=" + idEducacion + ", nombreEducacion=" + nombreEducacion + '}';
    }

    public void setNivelEducacion(NivelEducacion educacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
