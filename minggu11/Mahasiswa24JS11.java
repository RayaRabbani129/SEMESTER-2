public class Mahasiswa24JS11 {
    String nim;
    String nama;
    String keperluan;

    public Mahasiswa24JS11(){
        
    }

    public Mahasiswa24JS11(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilkan() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Keperluan: " + keperluan);
    }
}
