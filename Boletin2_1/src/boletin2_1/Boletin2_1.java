/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import javax.swing.JOptionPane;

/**
 *
 * @author JesusQuesada
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float base ;
        float altura ;
        float area ;
        base = Float.parseFloat(JOptionPane.showInputDialog("base "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("altura "));
        area = base*altura/2;
        JOptionPane.showMessageDialog(null, " Area = "+area);
        
    }
    
}
