public class mahasiswaBerprestasi24 {
    mahasiswa24[] listMhs = new mahasiswa24[5];
    int idx;

    void tambah(mahasiswa24 m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(mahasiswa24 m:listMhs){
            m.tampilkanInformasi();
            System.out.println("------------------------");
        }
    }

    void bubbleSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            for(int j = 1; j < listMhs.length-1; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    mahasiswa24 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j < listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            mahasiswa24 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for(int i = 0; i < listMhs.length; i++){
            mahasiswa24 temp = listMhs[i];
            int j = i;
            while(j > 0 && listMhs[j-1].ipk < temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++){
            if(listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if(pos != -1){
            System.out.println("Data mahasiswa demgam ipk: " + x + " ada di posisi ke-" + pos);
        }else{
            System.out.println("Data mahasiswa dengan ipk: " + x + " tidak ada");
        }
    }

    void tampilDataSearch(double x, int pos){
        if(pos != -1){
            System.out.println("Nim\t: " + listMhs[pos].nim);
            System.out.println("Nama\t: " + listMhs[pos].nama);
            System.out.println("Kelas\t: " + listMhs[pos].kelas);
            System.out.println("ipk\t: " + x);
        }else{
            System.out.println("Data mahasiswa dengan ipk: " + x + " tidak ditemukan");
        }
    }
}