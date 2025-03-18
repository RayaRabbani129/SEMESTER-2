public class sortingMain24 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        sorting24 darurat1 = new sorting24(a, a.length);
        sorting24 darurat2 = new sorting24(b, b.length);

        System.out.println("Data awal 1");
        darurat1.tampil();
        darurat1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        darurat1.tampil();
        System.out.println("Data awal 2");
        darurat2.tampil();
        darurat2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SOR (ASC)");
        darurat2.tampil();
    }
}
