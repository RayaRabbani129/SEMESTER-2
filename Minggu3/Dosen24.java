public class Dosen24 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    public Dosen24(String kode1, String nama1, boolean jenisKelamin1, int usia1){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanInfo() {
        String jk = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode Dosen    : " + kode);
        System.out.println("Nama Dosen    : " + nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + usia);
        System.out.println("---------------------------");
    }
}
