/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Latihan47 {
    public static void main(String[] args) {
        // Input Nama 
        String nama = JOptionPane.showInputDialog("Masukkan nama anda!"); 
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur anda!")); 
// Print 
System.out.println("Hai " + nama + ", apa kabar? Tidak terasa sekarang anda sudah " + umur + " tahun.");
    }
} 