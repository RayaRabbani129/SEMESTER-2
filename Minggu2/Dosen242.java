public class Dosen242 {
    String idDosen, nama, bidangKeahlian, keAktifan;
    int tahunBergabung;
    boolean statusAktif;

    void tampilInformasi(){
        System.out.println("Id dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Status aktif: " + keAktifan);
    }

    void setStatusAktif(boolean Status){
        if(statusAktif == true){
            keAktifan = "Aktif";
        }else{
           keAktifan = "Tidak aktif"; 
        }
    }

    int hitungMasaKerja(int thnSekarang){
        int hitungMasaKerja = thnSekarang - tahunBergabung;
        return hitungMasaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
