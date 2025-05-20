import java.util.Scanner;
public class filmMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        listFilm24 list = new listFilm24();
        int pilihan;

        do {
            System.out.println("\n===============================");
            System.out.println("DAFTAR FILM");
            System.out.println("===============================");
            System.out.println("1. Tambah Film");
            System.out.println("2. Cetak Data");
            System.out.println("3. Cari Berdasarkan ID");
            System.out.println("4. Urutkan Rating (Descending)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("ID Film  : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul    : ");
                    String judul = sc.nextLine();
                    System.out.print("Rating   : ");
                    double rating = sc.nextDouble();
                    list.addFilm(new Film24(id, judul, rating));
                    break;
                case 2:
                    list.print();
                    break;
                case 3:
                    System.out.print("Masukkan ID yang dicari: ");
                    int cariId = sc.nextInt();
                    list.cariDariId(cariId);
                    break;
                case 4:
                    list.sortByRatingDescending();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
    }
}
