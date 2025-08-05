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
public class Bab6Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String temp = JOptionPane.showInputDialog(null,
"Masukan Angka", "Menentukan Ganjil Genap",
JOptionPane.QUESTION_MESSAGE);
int input =
Integer.parseInt(temp);
System.out.println((input %
2)); if ((input % 2) == 0) {
JOptionPane.showMessageDialog(null, "Angka : "
+ input + " "
+ "adalah bilangan GENAP", "Informasi",
JOptionPane.INFORMATION_MESSAGE);
} else if ((input % 2) == 1) {
JOptionPane.showMessageDialog(null, "Angka : " + input + " "
+ "adalah bilangan GANJIL", "Informasi",
JOptionPane.INFORMATION_MESSAGE);
}
}
    }

    

