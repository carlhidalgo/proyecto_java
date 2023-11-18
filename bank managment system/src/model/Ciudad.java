/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlos
 */
public class Ciudad {
    
    private String id_Ciudad;
    private String nombre_Ciudad;

    public Ciudad() {
    }

    public Ciudad(String id_Ciudad, String nombre_Ciudad) {
        this.id_Ciudad = id_Ciudad;
        this.nombre_Ciudad = nombre_Ciudad;
    }

    public String getId_Ciudad() {
        return id_Ciudad;
    }

    public void setId_Ciudad(String id_Ciudad) {
        this.id_Ciudad = id_Ciudad;
    }

    public String getNombre_Ciudad() {
        return nombre_Ciudad;
    }

    public void setNombre_Ciudad(String nombre_Ciudad) {
        this.nombre_Ciudad = nombre_Ciudad;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id_Ciudad=" + id_Ciudad + ", nombre_Ciudad=" + nombre_Ciudad + '}';
    }

    
}
