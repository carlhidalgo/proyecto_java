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
public class Cliente {

   
        
    
    private String idCliente;
    private String rutCliente;
    private String dvrutCliente;
    private String nombreCliente;
    private String generoCliente;
    private String direccionCliente;
    private String emailCliente;
    private String ecivilCliente;
    private Integer sueldoCliente;
    private Date fechaNcacimiento;
    // Otros atributos...

    // Constructor, getters y setters

    public Cliente() {
    }

    public Cliente(String idCliente, String rutCliente, String dvrutCliente, String nombreCliente, String generoCliente, String direccionCliente, String emailCliente, String ecivilCliente, Integer sueldoCliente, Date fechaNcacimiento) {
        this.idCliente = idCliente;
        this.rutCliente = rutCliente;
        this.dvrutCliente = dvrutCliente;
        this.nombreCliente = nombreCliente;
        this.generoCliente = generoCliente;
        this.direccionCliente = direccionCliente;
        this.emailCliente = emailCliente;
        this.ecivilCliente = ecivilCliente;
        this.sueldoCliente = sueldoCliente;
        this.fechaNcacimiento = fechaNcacimiento;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDvrutCliente() {
        return dvrutCliente;
    }

    public void setDvrutCliente(String dvrutCliente) {
        this.dvrutCliente = dvrutCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getEcivilCliente() {
        return ecivilCliente;
    }

    public void setEcivilCliente(String ecivilCliente) {
        this.ecivilCliente = ecivilCliente;
    }

    public Integer getSueldoCliente() {
        return sueldoCliente;
    }

    public void setSueldoCliente(Integer sueldoCliente) {
        this.sueldoCliente = sueldoCliente;
    }

    public Date getFechaNcacimiento() {
        return fechaNcacimiento;
    }

    public void setFechaNcacimiento(Date fechaNcacimiento) {
        this.fechaNcacimiento = fechaNcacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", rutCliente=" + rutCliente + ", dvrutCliente=" + dvrutCliente + ", nombreCliente=" + nombreCliente + ", generoCliente=" + generoCliente + ", direccionCliente=" + direccionCliente + ", emailCliente=" + emailCliente + ", ecivilCliente=" + ecivilCliente + ", sueldoCliente=" + sueldoCliente + ", fechaNcacimiento=" + fechaNcacimiento + '}';
    }

    

    
    

  
    
}
