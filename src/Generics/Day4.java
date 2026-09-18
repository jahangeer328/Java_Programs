package Generics;

import java.util.ArrayList;
import java.util.List;

class Sample<T, U extends Number>{

    T first;
    U second;

    Sample(T first , U second){
        this.first = first;
        this.second = second;
    }

    public void print(){
        System.out.println(this.first + " , " + this.second);
    }

}
public class Day4 {
    public static void main(String[] args) {

//        Sample<String,Integer> sample = new Sample<>("Jahangeer" , 21);
//        sample.print();
////        print("jahangeer", 22);
////        print(21,34);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        printList(animals);



    }

    public static <T, U extends Number> void print(T t , U u){
        System.out.println(t + " , " + u);
    }

    //why wild card
    //Generics is invariant it breaks parent and child relationship means is-a relationship

    public static void printList(List<?> value){
        for (Object obj  : value){
            System.out.println(obj);
        }
    }


}
