package Task;

import java.lang.foreign.SymbolLookup;

//this can accept every type of data
//type safety,less type casting,
//error checked at compile time
//code reusability increase
//Class Always deal with Object not primitive types that why we use
// wrapper class instead primitive data types

class Box<T , U> {

     T first;
     U second;


    Box(T first, U second){
        this.first = first;
        this.second = second;

    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}
public class Task1Generics {
    public static void main(String[] args) {
        Box<Integer,String> box = new Box<>(10,"Ok");
        Box<String,Boolean> box1  =new Box<>("Something",false);
        Box<Boolean, Integer> box2 = new Box<>(false, 10);

        System.out.println(box.getFirst() + " , " + box.getSecond());
        System.out.println(box1.getFirst() + " , " + box1.getSecond());
        System.out.println(box2.getFirst() + " , " + box2.getSecond());
    }
}
