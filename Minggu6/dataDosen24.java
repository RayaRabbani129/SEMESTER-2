public class dataDosen24 {
    dosen24[] dataDosen24 = new dosen24[4];
    int idx = 0;

    void tambah(dosen24 dsn){
        if(idx < dataDosen24.length){
            dataDosen24[idx] = dsn;
            idx++;
        }else{
            System.out.println("Data dosen penuh");
        }
    }

    void tampil(){
        for(dosen24 d:dataDosen24){
            d.tampil();
            System.out.println("------------------------------");
        }
    }

    void sortingASC(){
        for(int i = 0; i < dataDosen24.length-1; i++){
            for(int j = 1; j < dataDosen24.length-1; j++){
                if(dataDosen24[j].usia < dataDosen24[j-1].usia){
                    dosen24 temp = dataDosen24[j];
                    dataDosen24[j] = dataDosen24[j-1];
                    dataDosen24[j-1] = temp;
                }
            }
        }
    }

    void sortingDSC(){
        for(int i = 0; i < dataDosen24.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j < dataDosen24.length; j++){
                if(dataDosen24[j].usia > dataDosen24[idxMin].usia){
                    idxMin = j;
                }
            }
            dosen24 temp = dataDosen24[idxMin];
            dataDosen24[idxMin] = dataDosen24[i];
            dataDosen24[i] = temp;
        }
    }

    void isertionSort(){
        for(int i = 1; i < dataDosen24.length; i++){
            dosen24 key = dataDosen24[i];
            int j = i-1;
            while(j >= 0 && dataDosen24[j].usia > key.usia){
                dataDosen24[j+1] = dataDosen24[j];
                j--;
            }
            dataDosen24[j+1] = key;
        }
    }
}