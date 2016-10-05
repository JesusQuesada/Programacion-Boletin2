/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import javax.swing.JOptionPane;

/**
 *
 * @author JesusQuesada
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double euros, cambio, dolares;
        euros = Double.parseDouble(JOptionPane.showInputDialog("euros "));
        cambio = Double.parseDouble(JOptionPane.showInputDialog("cambio "));
        dolares = euros*cambio;
        JOptionPane.showMessageDialog(null, "Dólares = "+dolares);
    }
    
}
    
}
