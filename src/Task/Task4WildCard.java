package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//wildCards <?> it can accept using only question all types of list
public class Task4WildCard {
    public static void main(String[] args) {

//        List<Dog> dogs = new ArrayList<>();
//
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//
//        fun(dogs); //I can't pass the list of dogs it expect list of animals

        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Dog());

        //easily can pass list of animal
        fun(animals);


    }
    //I can pass only list of Animal
//    static void fun(List<Animal> animals){
//        for (Animal a : animals){
//            a.eat();
//        }
//    }

    //i can give every type list but can add,read
    static  void fun(List<? /* extends Animal*/ super Animal > animals){
      // value.add("hello"); compile it not no which type will come
//        Object obj =

//        for (Object obj : value){
//            System.out.println(obj.getClass().getName());
//        }
        //extends related
//        for (Animal a : animals){
//            a.eat();
//
//        }

        animals.add(new Dog());

        for (Object obj : animals){
            System.out.println(obj.getClass().getName());
        }

    }
}

class Animal{
    void eat(){
        System.out.println("Animal Eating ...");
    }

    void walk(){
        System.out.println("Animal Walking ...");
    }
}

class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("Dog is eating ...");
    }
    void bark(){
        System.out.println("Dog is Barking ...");
    }
}
