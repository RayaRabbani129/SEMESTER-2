public class mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa24(){

    }

    public mahasiswa24(String nim, String nama, String kls, double ip){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilkanInformasi(){
        System.out.println(nim + "\t" + nama + "\t" + kelas + "\t" + ipk);
    }
}
