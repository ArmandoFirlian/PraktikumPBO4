package SoalpraktikumPBO4;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Pekerja
        Pekerja pekerja1 = new Pekerja("Tsukasa", 40, "Pro Boxers", 200000);

        // Menampilkan informasi pekerja
        System.out.println("Informasi Pekerja:");
        System.out.println(pekerja1.toString());

        // Mengubah nama pekerja
        pekerja1.setNama("Mike Tyson");
        System.out.println("\nInformasi Pekerja setelah perubahan nama:");
        System.out.println(pekerja1.toString());
    }
}