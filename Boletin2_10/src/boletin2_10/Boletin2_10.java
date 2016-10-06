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
        long billete100, billete20, billete5, moneda1;
        double euros;
        euros = Long.parseLong(JOptionPane.showInputDialog("Total euros "));
        billete100 = (long) (euros/100);
        billete20 = (long) (euros%100/20);
        billete5 = (long) (euros%20/5);
        moneda1 = (long) (euros%5);
        JOptionPane.showMessageDialog(null, "Billetes de 100 ="+billete100+"\nBilletes de 20 ="+billete20+"\nBilletes de 5 ="+billete5+"\nMonedas de 1 ="+moneda1);
    }
    
}
