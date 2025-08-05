/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab6.java;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author PC 12 - LAB R1
 */
public class pj62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nilai = JOptionPane.showInputDialog
(null, "Masukan nilai :");
switch (nilai.toUpperCase()) {
case "A":
JOptionPane.showMessageDialog(null, "Sangat baik.");
break;
case "B":
JOptionPane.showMessageDialog(null, "Baik.");
break;
case "C":
JOptionPane.showMessageDialog(null, "Cukup.");
case "D":
JOptionPane.showMessageDialog(null, "Jelek.");
break;
default :
JOptionPane.showMessageDialog(null,
"Salah memasukan nilai !");
}
    }
    
}
