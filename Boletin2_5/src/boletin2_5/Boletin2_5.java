/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import javax.swing.JOptionPane;

/**
 *
 * @author JesusQuesada
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double millas, metros;
        final int CONSTANTEMILLAS = 1852;
        millas = Double.parseDouble(JOptionPane.showInputDialog("Millas "));
        metros = millas*CONSTANTEMILLAS;
        JOptionPane.showMessageDialog(null, "Metros = "+metros);
    }
    
}