public class DoubleLinkedList24 {
    Node24 head;
    int size;

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item){
        if(isEmpty()){
            head = new Node24(null, item, null);
        }else{
            Node24 newNode24 = new Node24(null, item, head);
            head.prev = newNode24;
            head = newNode24;
        }
        size++;
    }

    public void addLast(int item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node24 current = head;
            while(current.next != null){
                current = current.next;
            }
            Node24 newNode24 = new Node24(current, item, null);
            current.next = newNode24;
            size++;
        }
    }

    public void add(int item, int index) throws Exception{
        if(isEmpty()){
            addFirst(item);
        }else if(index < 0 || index > size){
            throw new Exception("Nilai index diluar batas");
        }else{
            Node24 current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Node24 newNode24 = new Node24(null, item, current);
                current.prev = newNode24;
                head = newNode24;
            }else{
                Node24 newNode24 = new Node24(current.prev, item, current);
                newNode24.prev = current.prev;
                newNode24.next = current;
                current.prev.next = newNode24;
                current.prev = newNode24;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if(!isEmpty()){
            Node24 tmp = head;
            while(tmp !=null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if(size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev =null;
            size--;
        }
    }

    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node24 current = head;
        while(current.next.next !=null){
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai index diluar batas");
        }else if(index == 0){
            removeFirst();
        }else{
            Node24 current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    public int getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List kosong");
        }
        Node24 tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai index di luar batas");
        }
        Node24 tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
