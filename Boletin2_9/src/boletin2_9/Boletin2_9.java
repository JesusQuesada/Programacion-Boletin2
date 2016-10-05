/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author jquesadaabeijon
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double billete100, billete20, billete5, moneda1, euros;
        billete100 = Float.parseFloat(JOptionPane.showInputDialog("Billetes de 100 euros "));
        billete20 = Float.parseFloat(JOptionPane.showInputDialog("Billetes de 20 euros "));
        billete5 = Float.parseFloat(JOptionPane.showInputDialog("Billetes de 5 euros "));
        moneda1 = Float.parseFloat(JOptionPane.showInputDialog("Monedas de 1 euro "));
        euros = billete100*100+billete20*20+billete5*5+moneda1;
        JOptionPane.showMessageDialog(null, "Total euros "+euros);
    }
    
}