public class singleLinkedList24 {
    nodeMahasiswa24 head;
    nodeMahasiswa24 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if(!isEmpty()){
            nodeMahasiswa24 tmp = head;
            System.out.print("Isi linked list:\t");
            while(tmp != null){
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFrist(mahasiswa24 input){
        nodeMahasiswa24 ndInput = new nodeMahasiswa24(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(mahasiswa24 input){
        nodeMahasiswa24 ndInput = new nodeMahasiswa24(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, mahasiswa24 input){
        nodeMahasiswa24 ndInput = new nodeMahasiswa24(input, null);
        nodeMahasiswa24 temp = head;
        do { 
            if(temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, mahasiswa24 input){
        if(index < 0){
            System.out.println("Index salah");
        }else if(index == 0){
            addFrist(input);
        }else{
            nodeMahasiswa24 temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.next = new nodeMahasiswa24(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }
}
