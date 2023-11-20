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
    private int idOcupacion;
    private String nombre;

    // Constructor, getters y setters

    public Ocupacion() {
    }

    public Ocupacion(int idOcupacion, String nombre) {
        this.idOcupacion = idOcupacion;
        this.nombre = nombre;
    }

    public int getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(int idOcupacion) {
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


    
}
