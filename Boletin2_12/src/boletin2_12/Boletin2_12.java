/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_12;

import javax.swing.JOptionPane;

/**
 *
 * @author jquesadaabeijon
 */
public class Boletin2_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sueldofijo, ventas, km, dia_desp, sueldoliquido, ss, irpf;
        sueldofijo = Float.parseFloat(JOptionPane.showInputDialog("Sueldo base "));
        ventas = Float.parseFloat(JOptionPane.showInputDialog("Ventas totales "));
        km = Float.parseFloat(JOptionPane.showInputDialog("Kilómetros totales "));
        dia_desp = Float.parseFloat(JOptionPane.showInputDialog("Días de desplazamiento "));
        ss = 36;
        irpf = 18/100;
        sueldoliquido = sueldofijo+ventas*5/100+km*2+dia_desp*30-ss*irpf;
        JOptionPane.showMessageDialog(null, "Sueldo líquido = "+sueldoliquido);
    }
    
}