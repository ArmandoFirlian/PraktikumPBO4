package SoalpraktikumPBO4;

public class Pekerja extends Manusia {
    private double gaji;

    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() + 
               "\nUsia: " + usia + 
               "\nPekerjaan: " + pekerjaan + 
               "\nGaji: $" + gaji;
    }
}
