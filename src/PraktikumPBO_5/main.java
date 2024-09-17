/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPBO_5;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.nama = "Corolla";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        System.out.println("Informasi Mobil:");
        mobil.tampilkanInfo();

        System.out.println();

        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha R15";
        motor.kecepatan = 120;
        motor.jenisMesin = "4-tak";
        System.out.println("Informasi Sepeda Motor:");
        motor.tampilkanInfo();
    }
}
