public class dosen24 {
    String kode, nama, kelamin;
    boolean jenisKelamin;
    int usia;

    public dosen24() {
    }

    dosen24(String kd, String name, boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        if(true){
            kelamin = "Pria";
        }else{
            kelamin = "Wanita";
        }
        System.out.println("Usia: " + usia);
    }
}
