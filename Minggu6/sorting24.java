public class sorting24 {
    int[] data;
    int jmlData;

    sorting24(int Data[], int jmlDat){
        jmlData = jmlDat;
        data = new int[jmlDat];
        for(int i = 0; i < jmlData; i++){
            data[i] = Data[i];
        }
    }
    
    void bubbleSort(){
        int temp = 0;
        for(int i = 0; i < jmlData-1; i++){
            for(int j = 1; j < jmlData-i; j++){
                if(data[j-1] > data[j]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }
    
    void tampil(){
        for(int i = 0; i < jmlData; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
