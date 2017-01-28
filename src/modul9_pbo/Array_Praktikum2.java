/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9_pbo;

/**
 *
 * @author Iin Nuraini
 */
import javax.swing.JOptionPane;
public class Array_Praktikum2 {
public static void main (String[] args){
    String inputan1="";
    inputan1 = JOptionPane.showInputDialog("Masukkan Kata 1 :");
    String pesan1= inputan1;
    
    String inputan2="";
    inputan2 = JOptionPane.showInputDialog("Masukkan Kata 2 :");
    String pesan2= inputan2;

    String inputan3="";
    inputan3 = JOptionPane.showInputDialog("Masukkan Kata 3 :");
    String pesan3= inputan3;
    
    JOptionPane.showMessageDialog(null, pesan1+" "+pesan2+" "+pesan3);
}
    
}
