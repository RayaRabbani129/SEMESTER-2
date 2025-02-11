import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        long nim = sc.nextLong(); 

        nim = nim % 100;
        if (nim < 10) {
            nim += 10;
        }

        System.out.println("n: " + nim);

        // Menampilkan deret bilangan
        for (int i = 1; i <= nim; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewati angka 6 dan 10
            }
            if (i % 2 == 1) {
                System.out.print("*  "); // Cetak * untuk angka ganjil
            } else {
                System.out.print(i + "  "); // Cetak angka genap
            }
        }
    }
}
