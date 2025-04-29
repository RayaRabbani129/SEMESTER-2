import java.util.Scanner;
public class suratDemo24 {
    public static void main(String[] args) {
        stackSurat24 stack = new stackSurat24(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();  
                switch(pilih){
                case 1:
                System.out.print("ID Surat        : ");
                String id = sc.nextLine();
                System.out.print("Nama Mahasiswa  : ");
                String nama = sc.nextLine();
                System.out.print("Kelas           : ");
                String kelas = sc.nextLine();
                System.out.print("Jenis Izin (S/I): ");
                char jenis = sc.nextLine().charAt(0);
                System.out.print("Durasi (Hari)   : ");
                int durasi = sc.nextInt();

                surat24 surat = new surat24(id, nama, kelas, jenis, durasi);
                stack.TerimaSuratIzin(surat);
                break;
                case 2: 
                surat24 diproses = stack.Proses();
                if (diproses != null) {
                    System.out.println("\nSurat sedang diproses:");
                    diproses.tamilkanDataSurat();
                    System.out.println("\nSurat telah diproses:");
                }
                break;
                case 3:
                surat24 lihat = stack.LihatSuratTerakhir();
                if (lihat != null) {
                    System.out.println("\nSurat Terakhir:");
                    lihat.tamilkanDataSurat();
                }
                break;
                case 4: 
                System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    surat24 hasil = stack.CariSurat(cari);
                    if (hasil != null) {
                        System.out.println("Surat ditemukan:");
                        hasil.tamilkanDataSurat();
                    } else {
                        System.out.println("Tidak ditemukan surat dengan nama tersebut.");
                    }
                    break;
            }
        }while(pilih >= 1 && pilih <= 4);
    }
}