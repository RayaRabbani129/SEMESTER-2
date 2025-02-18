public class DosenMain24 {
    public static void main(String[] args) {
        int masaKerja;
        Dosen24 d1 = new Dosen24();
        d1.idDosen = "SP";
        d1.nama = "Suprapto";
        d1.bidangKeahlian = "SISOP";
        d1.tahunBergabung = 2008;

        d1.setStatusAktif(false);
        d1.tampilInformasi();
        masaKerja = d1.hitungMasaKerja(2025);
        System.out.println("Masa kerja: " + masaKerja);
        d1.ubahKeahlian("DASPRO");
        d1.tampilInformasi();
        System.out.println("Masa kerja" + masaKerja);
    }
}
