/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlos
 */
public class Ocupacion {
    private String idOcupacion;
    private String nombre;

    // Constructor, getters y setters

    public Ocupacion() {
    }

    public Ocupacion(String idOcupacion, String nombre) {
        this.idOcupacion = idOcupacion;
        this.nombre = nombre;
    }

    public String getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(String idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ocupacion{" + "idOcupacion=" + idOcupacion + ", nombre=" + nombre + '}';
    }

    public void setOcupacion(Ocupacion ocupacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
