package praktikum4;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Pagani", 200, "Huayra");
        System.out.println("informasi Mobil:");
        mobil.tampilkanInfoKendaraaan();
        
        Mobil evo = new Mobil("Nissan", 90, "ATTESA E-TS", 2);
        System.out.println("\nInformasi Mobil: ");
        evo.tampilkanInfoMobil();
    }
}