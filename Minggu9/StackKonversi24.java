public class StackKonversi24 {
    int[] tumpukkanBiner;
    int size; 
    int top;

    public StackKonversi24(){
        this.size = 32;  //asumsi 32 bit
        tumpukkanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size -1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack penuh");
        }else{
            top++;
            tumpukkanBiner[top] = data;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack kosong.");
            return -1;
        }else{
            int data = tumpukkanBiner[top];
            top--;
            return data;
        }
    }
}
