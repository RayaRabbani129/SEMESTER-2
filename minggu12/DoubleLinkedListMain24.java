public class DoubleLinkedListMain24 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList24 dll = new DoubleLinkedList24();

        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
        dll.clear();
        dll.print();
        System.out.println("Size: " + dll.size());
    }
}
