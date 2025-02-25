public class MataKuliah242 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("Kode MK:" + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("Sks: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSks(int sksBaru){
        sks = sksBaru;
        System.out.println("Sks telah diubah");
    }

    void tambahJam(int jam){
        jumlahJam = jumlahJam + jam;
        System.out.println("Jam berhasil ditambah");
    }

    void kurangiJam(int jam){
        if(jumlahJam < jam){
            System.out.println("Jam tidak bisa dikurang");
        }else{
            jumlahJam = jumlahJam - jam;
            System.out.println("Jam berhasil dikurangi");
        }
    }
}
