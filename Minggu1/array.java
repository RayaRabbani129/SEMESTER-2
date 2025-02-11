import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("===================================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine(); 

        String[] matkul = new String[jumlahMataKuliah];
        double[] nilaiAngka = new double[jumlahMataKuliah];
        int[] bobotSKS = new int[jumlahMataKuliah];
        String[] nilaiHuruf = new String[jumlahMataKuliah];
        double[] bobotNilai = new double[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan mata kuliah ke- " + (i + 1) + ": ");
            matkul[i] = sc.nextLine();

            System.out.print("Masukkan jumlah SKS : ");
            bobotSKS[i] = sc.nextInt();

            System.out.print("Masukkan nilai angka : ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] >= 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }
        }

        double totalNilai = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalNilai += bobotNilai[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        double ipSemester = totalNilai / totalSKS;

        System.out.println("\n===================================");
        System.out.println("          Hasil Konversi Nilai      ");
        System.out.println("===================================");
        System.out.printf("%-30s %-10s %-10s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.printf("%-30s %-10.2f %-10s %-10.2f\n", matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("\nIP Semester: " + String.format("%.2f", ipSemester));
}
}