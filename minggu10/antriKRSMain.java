import java.util.Scanner;
class antriKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antriKRS antrian = new antriKRS(10);
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Mahasiswa Terdepan (2 Mahasiswa)");
            System.out.println("5. Tampilkan Mahasiswa Terakhir");
            System.out.println("6. Cek Antrian Apakah Kosong");
            System.out.println("7. Cek Antrian Apakah Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Jumlah KRS dalam Antrian");
            System.out.println("10. Jumlah yang KRS yang Sudah Diproses");
            System.out.println("11. Jumlah yang KRS Mahasiswa Belum Meminta diproses");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa24 m = new Mahasiswa24(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(m);
                    break;
                case 2:
                    for (int i=1; i<=2; i++){
                        antrian.layaniMahasiswa();
                    }
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatTerdepan();
                    break;
                case 5:
                    antrian.LihatAkhir();
                    break;
                case 6:
                    System.out.println(antrian.IsEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 7:
                    System.out.println(antrian.IsFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 10:
                    antrian.jumlahDiproses();
                    break;
                case 11:
                    antrian.jumlahBelumDiproses();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}