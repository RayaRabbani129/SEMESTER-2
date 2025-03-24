import java.util.Scanner;
public class mahasiswaDemo24 {
    public static void main(String[] args) {
        mahasiswaBerprestasi24 list = new mahasiswaBerprestasi24();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            list.tambah(new mahasiswa24(nim, nama, kelas, ipk));
        }

        list.tampil();
        // Pencarian data menggunakan sequential search
        System.out.println("=====================================");
        System.out.println("Pencarian data");
        System.out.println("=====================================");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}
