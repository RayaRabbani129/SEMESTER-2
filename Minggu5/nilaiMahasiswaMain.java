public class nilaiMahasiswaMain {
    public static void main(String[] args) {
        int[] nilaiUts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUas = {82, 88, 87, 79, 95, 85, 83, 84};
        
        nilaiMahasiswa nm = new nilaiMahasiswa();
        int nilaiTertinggi = nm.cariNilaiMax(nilaiUts, 0, nilaiUts.length - 1);
        int nilaiTerendah = nm.cariNilaiMin(nilaiUts, 0, nilaiUts.length - 1);
        double rataRataUas =nm.hitungRataRata(nilaiUas);

        System.out.println("Nilai UTS tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai UTS terendah: " + nilaiTerendah);
        System.out.println("Rata-rata nilai UAS: " + rataRataUas);
    }
}
