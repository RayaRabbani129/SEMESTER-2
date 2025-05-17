import java.util.Scanner;
public class antrianMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queueLayanan24 antrian = new queueLayanan24();
        int pilih;

        do {
            System.out.println("\n==== MENU ANTRIAN LAYANAN KEMAHASISWAAN ====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Jumlah Mahasiswa Dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("Keperluan : ");
                    String keperluan = sc.nextLine();
                    Mahasiswa24JS11 m = new Mahasiswa24JS11(nim, nama, keperluan);
                    antrian.enqueue(m);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFront();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    antrian.printQueue();
                    break;
                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    antrian.jumlahAntrian();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}
