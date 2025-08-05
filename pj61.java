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
public class pj61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String umur = JOptionPane.showInputDialog(null, "Kamu umur berapa ?");
if (Integer.parseInt(umur) <= 5) {
JOptionPane.showMessageDialog(null, "Balita");
} else if (Integer.parseInt(umur) >= 6 && Integer.parseInt(umur) <= 11)
{ JOptionPane.showMessageDialog(null, "Anak - anak");
} else if (Integer.parseInt(umur) >= 12 && Integer.parseInt(umur) <= 25)
{ JOptionPane.showMessageDialog(null, "Remaja");
} else {
JOptionPane.showMessageDialog(null, "Dewasa");
      }
    }
}
    
