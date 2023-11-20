/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlos
 */
public class TipoMovimiento {
    private String idTipoMov;
    private String nombreTipoMov;
    
    
    // Constructor, getters y setters

    public TipoMovimiento() {
    }

    public String getIdTipoMov() {
        return idTipoMov;
    }

    public void setIdTipoMov(String idTipoMov) {
        this.idTipoMov = idTipoMov;
    }

    public String getNombreTipoMov() {
        return nombreTipoMov;
    }

    public void setNombreTipoMov(String nombreTipoMov) {
        this.nombreTipoMov = nombreTipoMov;
    }

    @Override
    public String toString() {
        return "tipoMovimiento{" + "idTipoMov=" + idTipoMov + ", nombreTipoMov=" + nombreTipoMov + '}';
    }
    
}
