/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO5;


/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        anjing asu = new anjing();
        asu.nama = "amado";
        asu.jenis = "Friendly";
        asu.suara = "goek goek goek";
        asu.Usia = 80;
        System.out.println("Ini anjing apa:");
        asu.infohewan();

        System.out.println();
        
        kucing pugi = new kucing();
        pugi.nama = "pugi";
        pugi.jenis = "Salome";
        pugi.suara = "Eemeng emeng";
        pugi.Usia = 150;
        System.out.println("Ini kucing apa :");
        pugi.infohewan();
    }
}
