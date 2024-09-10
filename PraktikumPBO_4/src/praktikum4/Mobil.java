/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author ASUS
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void tampilkanInfoMobil() {
        System.out.println("Informasi Mobil:");
        System.out.println("Nama: " + getNama());  // Mengakses merk melalui getter karena private
        System.out.println("Kecepatan Max: " + kecepatanMaks + "km/h" );     // Dapat mengakses langsung karena protected    // Dapat mengakses langsung karena public
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}