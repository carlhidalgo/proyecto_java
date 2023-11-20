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
    private String nombreOcupacion;

    // Constructor, getters y setters

    public Ocupacion() {
    }

    public Ocupacion(int idOcupacion, String nombre) {
        this.idOcupacion = idOcupacion;
        this.nombreOcupacion = nombre;
    }

    public int getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(int idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public String getNombre() {
        return nombreOcupacion;
    }

    public void setNombre(String nombre) {
        this.nombreOcupacion = nombre;
    }

    @Override
    public String toString() {
        return "Ocupacion{" + "idOcupacion=" + idOcupacion + ", nombre=" + nombreOcupacion + '}';
    }


    
}
