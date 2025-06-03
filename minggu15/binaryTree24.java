public class binaryTree24 {
    node24 root;

    public binaryTree24(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(mahasiswa24 mahasiswa){
        node24 newNode = new node24(mahasiswa);
        if (isEmpty()){
            root = newNode;
        }else{
            node24 current = root;
            node24 parent = null;
            while(true){
                parent = current;
                if(mahasiswa.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk){
        boolean result = false;
        node24 current = root;
        while(current != null){
            if(current.mahasiswa.ipk == ipk){
                result = true;
                break;
            }else if(ipk > current.mahasiswa.ipk){
                current = current.right;
            }else{
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(node24 node){
        if (node != null){
            node.mahasiswa.tampilkanInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(node24 node){
        if (node != null){
            traverseInOrder(node.left);
            node.mahasiswa.tampilkanInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(node24 node){
        if (node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilkanInformasi();
        }
    }

    node24 getSuccessor(node24 del){
        node24 successor = del.right;
        node24 successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if(isEmpty()){
            System.out.println("Binary tree kosong");
            return;
        }
        node24 parent = root;
        node24 current = root;
        boolean isLeftChild = true;
        while(current != null){
            if(current.mahasiswa.ipk == ipk){
                break;
            }else if(ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current == null){
            System.out.println("Data tidak ditemukan");
            return;
        }else{
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left == null){
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                node24 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilkanInformasi();
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(mahasiswa24 data) {
        root = tambahRekursif(root, data);
    }

    public node24 tambahRekursif(node24 current, mahasiswa24 data) {
        if (current == null){
            return new node24(data);
        }
        if(data.ipk < current.mahasiswa.ipk){
            current.left = tambahRekursif(current.left, data);
        }else{
            current.right = tambahRekursif(current.right, data);
        }
        return current;
    }

    public void cariMinIPK() {
        if(isEmpty()){
            System.out.println("Data mahasiswa masih kosong.");
            return;
        }
        node24 current = root;
        while(current.left != null){
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terendah:");
            current.mahasiswa.tampilkanInformasi();
    }

    public void cariMaxIPK(){
        if (isEmpty()) {
            System.out.println("Data mahasiswa masih kosong.");
            return;
        }
        node24 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK tertinggi:");
        current.mahasiswa.tampilkanInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double batas){
        System.out.println("Daftar mahasiswa dengan IPK di atas " + batas + ":");
        tampilMahasiswaIPKdiAtasRek(root, batas);
    }

    public void tampilMahasiswaIPKdiAtasRek(node24 node, double batas) {
        if (node != null) {
            tampilMahasiswaIPKdiAtasRek(node.left, batas);
            if (node.mahasiswa.ipk > batas) {
                node.mahasiswa.tampilkanInformasi();
            }
            tampilMahasiswaIPKdiAtasRek(node.right, batas);
        }
    }
}
