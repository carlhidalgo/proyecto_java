/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class Movimiento {
    private LocalDate fecha;
    private int monto;
    private String[][] cartola;

    public Movimiento() {
    }

    public Movimiento(LocalDate fecha, int monto) {
        this.fecha = fecha;
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String[][] getCartola() {
        return cartola;
    }

    public void setCartola(String[][] cartola) {
        this.cartola = cartola;
    }
    
    public void guardar(String id_mov,String fecha, String monto, String tipo_mov){
        String[] array = {id_mov,fecha,monto,tipo_mov};
        cartola = Arrays.copyOf(cartola, cartola.length+1);
        cartola[cartola.length] = array;
    }
    
}
