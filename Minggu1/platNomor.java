import java.util.Scanner;

public class platNomor {
    public static void main(String[] args) {
        // Array untuk kode plat nomor
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Array untuk nama kota
        String[] kota = {
            "BANTEN", 
            "JAKARTA", 
            "BANDUNG", 
            "CIREBON", 
            "BOGOR",
            "PEKALONGAN", 
            "SEMARANG", 
            "SURABAYA", 
            "MALANG", 
            "TEGAL"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = sc.next().charAt(0); //menghilangkan error

        int index = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Kode plat nomor dari kota: " + kota[index]); //menghilangkan error
        } else {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
