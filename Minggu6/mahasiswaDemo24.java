public class mahasiswaDemo24 {
    public static void main(String[] args) {
        mahasiswaBerprestasi24 list = new mahasiswaBerprestasi24();
        mahasiswa24 m1 = new mahasiswa24("123", "Zidan", "2A", 3.2);
        mahasiswa24 m2 = new mahasiswa24("124", "Ayu", "2A", 3.5);
        mahasiswa24 m3 = new mahasiswa24("125", "Sofi", "2A", 3.1);
        mahasiswa24 m4 = new mahasiswa24("126", "Sita", "2A", 3.9);
        mahasiswa24 m5 = new mahasiswa24("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
        System.out.println("Data sudah diurutkan dengan SELECTION SOR (ASC)");
        list.selectionSort();
        list.tampil();
    }
}
