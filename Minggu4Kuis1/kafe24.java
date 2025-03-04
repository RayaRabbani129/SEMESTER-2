public class kafe24 {
    String namaKafe, lokasiKafe;
    int jumlahMeja, hargaMie = 20000, hargaTahu = 7000, hargaEsKu = 12000, hargaEsKo = 15000;
    double jumlahPesanan;

    public kafe24(String namaKafe, String lokasiKafe, int jumlahMeja){
        this.namaKafe = namaKafe;
        this.lokasiKafe = lokasiKafe;
        this.jumlahMeja = jumlahMeja;
        this.jumlahPesanan = 0;
    }

    void tampilkanMenu(){
        System.out.println("====== Menu Kafe ======");
        System.out.println("1. Mie");
        System.out.println("2. Tahu");
        System.out.println("3. Es Kuwut");
        System.out.println("4. Es Kopi");
        System.out.println("5. Selesai");
    }

    public void tampilkanInfoKafe() {
        System.out.println("\n=== Informasi Kafe ===");
        System.out.println("Nama Kafe: " + namaKafe);
        System.out.println("Lokasi: " + lokasiKafe);
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("======================");
    }
}
