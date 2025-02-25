public class MataKuliah24 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah24(String kode, String nama, int sks, int jumlajJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(int sks){
        sks = sks + sks;
        System.out.println("SKS berhasil ditambahkan");
    }

    void cetakInfo(){
        System.out.println("Kode :" + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Sks: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }
}
