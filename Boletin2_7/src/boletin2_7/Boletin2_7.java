/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import javax.swing.JOptionPane;

/**
 *
 * @author JesusQuesada
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n, rentamensual;
        float i, tm, im;
        int t;
        n = Double.parseDouble(JOptionPane.showInputDialog("Nominal "));
        i = Float.parseFloat(JOptionPane.showInputDialog("Interés "));
        t = Integer.parseInt(JOptionPane.showInputDialog("Años "));
        tm = t*12;
        im = i/1200;
        rentamensual = n*Math.pow((1+im),tm)*im/(Math.pow((1+im),tm)-1);
        JOptionPane.showMessageDialog(null, "Renta Mensual = "+rentamensual);
        
        
        
    }
    
}
