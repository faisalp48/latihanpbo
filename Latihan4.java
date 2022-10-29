/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan4 {
    public static void main(String[] args) {
        int huruf ;
        Scanner hur = new Scanner(System.in);
        System.out.println("Masukan Huruf = ");
        huruf = hur.nextInt();
        
        switch(huruf){
            case 1:
            System.out.println("Huruf " + huruf + " Menjadi 4");
            break;
            case 2:
            System.out.println("Huruf " + huruf + " Menjadi 3");
            break;
            case 3:
            System.out.println("Huruf " + huruf + " Menjadi 2");
            break;
            case 4:
            System.out.println("Huruf " + huruf + " Menjadi 1");
            break;
            case 5:
            System.out.println("Huruf " + huruf + " Menjadi 0");
            break;
            default:
            System.out.println("Huruf Tidak Tersedia " + huruf + " Tidak Tersedia");
            break;
       }
    }
}