/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author JesusQuesada
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float celsius, fahrenheit, kelvin;
        celsius = Float.parseFloat(JOptionPane.showInputDialog("Grados Celsius "));
        fahrenheit = (float) (celsius*1.8+32);
        kelvin = (float) (celsius+273.15);
        JOptionPane.showMessageDialog(null, "Grados Fahrenheit = "+fahrenheit+"\nGrados Kelvin = "+kelvin);
        
    }
    
}
