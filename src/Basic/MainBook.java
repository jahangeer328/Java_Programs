package Basic;

import java.util.HashSet;
import java.util.Objects;

class Book2{
    private final int id;
    private final String name;

    Book2(int id , String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true; // may when same reference pass

        if(obj == null) return false; //when refenence variable cariated but not intialize this will handle it
        if(obj.getClass() != this.getClass()) return false;
        Book2 book = (Book2) obj;

        return (this.id == book.id && this.name == book.name);

    }

    @Override
    public int hashCode(){
//        return Objects.hash(id,name);
        int result = 17;
        result = result * 17 + id;
        result = result * 31 + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
public class MainBook {
    public static void main(String[] args) {
        Book2 book1 = new Book2(123421,"Java New ");
        Book2 book2 = new Book2(123421,"Java New ");

        Integer i = 28;
        Book2 b = null;
        System.out.println(book1.equals(b));
        HashSet<Book2> uniqueBook = new HashSet<>();

        uniqueBook.add(book1);
        uniqueBook.add(book2);
        System.out.println("Size is  : " + uniqueBook.size());
    }
}
