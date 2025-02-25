import java.util.Scanner;
public class MataKuliahDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah24[] arrayOfMataKuliah24 = new MataKuliah24[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i = 0; i < 3; i++){
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Kode: ");
            kode = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("SKS: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------------");

            arrayOfMataKuliah24[i] = new MataKuliah24(kode, nama, sks, i);
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Data mata kuliah ke-" + (i + 1));
            System.out.println("Kode: " + arrayOfMataKuliah24[i].kode);
            System.out.println("Nama: " + arrayOfMataKuliah24[i].nama);
            System.out.println("SKS: " + arrayOfMataKuliah24[i].sks);
            System.out.println("Jumlah jam: " + arrayOfMataKuliah24[i].jumlahJam);
        }
    }
}
