/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;

import javax.swing.JOptionPane;

/**
 *
 * @author JesusQuesada
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int billete100, billete20, billete5, moneda1, euros;
        euros = Integer.parseInt(JOptionPane.showInputDialog("Total euros "));
        billete100 = euros/100;
        billete20 = billete100/20;
        billete5 = billete20/5;
        moneda1 = billete5;
        JOptionPane.showMessageDialog(null, "Billetes de 100 ="+billete100+"\nBilletes de 20 ="+billete20+"\nBilletes de 5 ="+billete5+"\nMonedas de 1 ="+moneda1);
    }
    
}
