import java.util.Scanner;
public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiAkhir = 0;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUas = sc.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if(nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            nilaiAkhir = (nilaiTugas * 0.1) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
            System.out.println("Masukkan nilai Akhir: " + nilaiAkhir);

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("A");
            }else if (nilaiAkhir > 73 && nilaiAkhir <= 80){
                System.out.println("B+");
            }else if (nilaiAkhir > 65 && nilaiAkhir <= 73){
                System.out.println("B");
            }else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
                System.out.println("C+");
            }else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
                System.out.println("C");
            }else if (nilaiAkhir > 39 && nilaiAkhir <= 50){
                System.out.println("D");
            }else {
                System.out.println("E");
            }
        }if(nilaiAkhir > 50 && nilaiAkhir <= 100){
            System.out.println("SELAMAT ANDA LULUS");
        }else{
            System.out.println("MAAF ANDA TIDAK LULUS");
        }  
    }
}