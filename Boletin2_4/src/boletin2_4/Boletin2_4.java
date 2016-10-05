/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author JesusQuesada
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, suma, resta, producto, cociente;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Número 1 "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Número 2 "));
        suma = num1+num2;
        resta = num1-num2;
        producto = num1*num2;
        cociente = num1/num2;
        JOptionPane.showMessageDialog(null, "Suma ="+suma +"\nResta ="+resta +"\nProducto ="+producto +"\nCociente ="+cociente);
        
              
    }
    
}