public class mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa24(){
    }

    public mahasiswa24(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi(){
        System.out.println("NIM: " + this.nim + " "+
        "Nama: " + this.nama + " " +
        "Kelas: " + this.kelas + " " +
        "IPK: " + this.ipk);
    }
}
