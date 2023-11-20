/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.*;

/**
 *
 * @author pepsi
 */
public class TablaCartola extends JFrame{
    
    public TablaCartola(String nro_tarjeta,String[][] lista){
        String[] nombreColumna = {"ID movimiento", "Fecha", "monto", "tipo_mov"};
        JTable tabla = new JTable(lista, nombreColumna);
        add(tabla);
        
        setTitle("CARTOLA MENSUAL TARJETA N° " + nro_tarjeta);
        setBounds(350,200,720,480);
        setVisible(true);
    }
    
}
