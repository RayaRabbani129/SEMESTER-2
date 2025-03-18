public class sortingMain24 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        sorting24 darurat1 = new sorting24(a, a.length);

        System.out.println("Data awal 1");
        darurat1.tampil();
        darurat1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        darurat1.tampil();
    }
}
