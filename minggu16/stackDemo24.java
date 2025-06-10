import java.util.Stack;
public class stackDemo24 {
    public static void main(String[] args) {
        book24 book1 = new book24("1234", "Dasar Pemrogaman");
        book24 book2 = new book24("7145", "Hafalah Shalat Delisa");
        book24 book3 = new book24("3562", "Muhammad Al-Fatih");

        Stack<book24> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        book24 temp = books.peek();

        if(temp != null){
            System.out.println(temp.toString());
        }

        book24 temp2 = books.pop();

        if(temp2 != null){
            System.out.println(temp.toString());
        }

        for(book24 book : books){
            System.out.println(book.toString());
        }

        System.out.println(books);
    }
}
