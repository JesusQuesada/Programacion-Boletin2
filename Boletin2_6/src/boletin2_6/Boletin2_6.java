/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_6;

import javax.swing.JOptionPane;

/**
 *
 * @author JesusQuesada
 */
public class Boletin2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pvp, pagado, descuento;
        pvp = Double.parseDouble(JOptionPane.showInputDialog("PVP "));
        pagado = Double.parseDouble(JOptionPane.showInputDialog("Precio pagado "));
        descuento = 100*((pvp-pagado)/pvp);
        JOptionPane.showMessageDialog(null, "Descuento = "+descuento+"%");
    }
    
}