import java.util.Scanner;
public class dosenDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen24 list = new dataDosen24();
        dosen24 d1 = new dosen24("BD", "Budi", true, 44);
        dosen24 d2 = new dosen24("ST", "Santi", false, 50);
        dosen24 d3 = new dosen24("YN", "Yono", true, 60);
        dosen24 d4 = new dosen24("TS", "Tasya", false, 38);

        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);

        System.out.println("Data dosen sebelum di sorting");
        list.tampil();
        System.out.println("Data telah diurutkan secara ASCENDING berdasarkan usia");
        list.sortingASC();
        list.tampil();
        System.out.println("Data telah diurutkan secara DESCENDING berdasarkan usia");
        list.sortingDSC();
        list.tampil();
        System.out.println("Data telah diurutkan secara DESCENDING menggunakan Insertion Sort");
        list.isertionSort();
        list.tampil();
        System.out.println("Data Dosen:");
        list.tampil();

        System.out.print("\nMasukkan nama dosen yang dicari: ");
        String cariNama = sc.nextLine();
        list.pencarianDataSequential(cariNama);
        System.out.print("\nMasukkan usia dosen yang dicari: ");
        int cariUsia = sc.nextInt();
        list.pencarianDataBinary(cariUsia);
    }
}
