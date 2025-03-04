import java.util.Scanner;
public class DosenDemo24 {

    private static Dosen24[] daftarDosen;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        Dosen24[] arrayOfDosen24 = new Dosen24[jumlahDosen];

        for (int i=0; i < jumlahDosen; i++) {
            arrayOfDosen24[i] = new Dosen24();
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode Dosen: ");
            arrayOfDosen24[i].kode = sc.nextLine();
            System.out.print("Nama Dosen: ");
            arrayOfDosen24[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (true untuk wanita, false untuk pria): "); 
            arrayOfDosen24[i].jenisKelamin = sc.nextBoolean();
            System.out.print("Usia: ");
            arrayOfDosen24[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------");
        }

        for (int i=0; i < jumlahDosen; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            arrayOfDosen24[i].tampilkanInfo();
        }

        System.out.println("\nData Dosen:");
        DataDosen24.dataSemuaDosen(daftarDosen);
        DataDosen24.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen24.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen24.infoDosenPalingTua(daftarDosen);
        DataDosen24.infoDosenPalingMuda(daftarDosen);
        sc.close();
    }
}