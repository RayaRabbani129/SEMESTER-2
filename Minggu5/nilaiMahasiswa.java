public class nilaiMahasiswa {
    int cariNilaiMax(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int maxLeft = cariNilaiMax(uts, left, mid);
        int maxRight = cariNilaiMax(uts, mid + 1, right);
        return Math.max(maxLeft, maxRight);
    }

    int cariNilaiMin(int[] uts, int left, int right) {
        if (left == right) {
            return uts[left];
        }
        int mid = (left + right) / 2;
        int minLeft = cariNilaiMin(uts, left, mid);
        int minRight = cariNilaiMin(uts, mid + 1, right);
        return Math.min(minLeft, minRight);
    }

    double hitungRataRata(int[] uas) {
        int total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return (double) total / uas.length;
    }
}
