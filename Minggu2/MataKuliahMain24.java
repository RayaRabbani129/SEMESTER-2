public class MataKuliahMain24 {
    public static void main(String[] args) {
        MataKuliah242 mk1 = new MataKuliah242();
        mk1.nama = "Algoritma";
        mk1.kodeMK = "ALSD";
        mk1.jumlahJam = 4;
        mk1.sks = 2;

        mk1.tampilkanInformasi();
        mk1.tambahJam(2);
        mk1.ubahSks(6);
        mk1.tampilkanInformasi();
    }
}
