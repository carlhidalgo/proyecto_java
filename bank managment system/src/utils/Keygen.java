/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Random;

/**
 *
 * @author pepsi
 */
public class Keygen {
    Random random = new Random();
    
    public long keyTarjeta(){
        return Math.abs(random.nextLong() % 90000000L) + 5040936000000000L;
    }
    
    public long keyPin(){
        return Math.abs(random.nextLong() % 9000L) + 1000L;
    }
    
    public long keyCVV(){
        return Math.abs(random.nextLong() % 900L) + 100L;
    }
}
