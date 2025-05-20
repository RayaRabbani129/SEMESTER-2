import java.util.Scanner;
public class vaksinMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vaksin24 vks = new Vaksin24();
        int pilih;

        do {
            System.out.println("\n==============================");
            System.out.println("=== PENGANTRI VAKSIN ===");
            System.out.println("==============================");
            System.out.println("1. Tambah Data (addFirst)");
            System.out.println("2. Tambah Data (addLast)");
            System.out.println("3. Hapus Data");
            System.out.println("4. Cetak Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String prioritas = sc.nextLine();
                    vks.addFirst(prioritas);
                    break;
                case 2:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    vks.addLast(nama);
                    break;
                case 3:
                    vks.dequeue();
                    break;
                case 4:
                    vks.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
