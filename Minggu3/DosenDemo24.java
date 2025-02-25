import java.util.Scanner;
public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        Dosen24[] daftarDosen = new Dosen24[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nMasukkan data untuk Dosen ke-" + (i + 1) + ":");
            System.out.print("Kode Dosen    : ");
            String kode = sc.nextLine();

            System.out.print("Nama Dosen    : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            char jk = sc.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l'); 

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); 

            daftarDosen[i] = new Dosen24(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n=== Daftar Dosen ===");
        for (Dosen24 d : daftarDosen) {
            d.tampilkanInfo();
        sc.close(); 
    }
}
}