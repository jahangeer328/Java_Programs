package Revise_Work.Generics.WildCards.Leaning;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Animal{

    void eat(){
        System.out.println("Animal is Eating ...");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println(" Dog is Barking ..");

    }

    @Override
    public void eat(){
        System.out.println("Dog is Eating ...");
    }
}


class LabraDog extends Dog{

    @Override
    public void eat(){
        System.out.println("LabraDog is Eating ...");
    }
}


class GermanShe extends Dog{

    @Override
    public void eat(){
        System.out.println("GermanShe is Eating ...");
    }
}

class Cat extends Animal{

    void climbing(){
        System.out.println(" Cat is Climing on tree ..");
    }


    @Override
    public void eat(){
        System.out.println(" Cat is Eating");
    }
}


public class WildCards {

    public static void main(String[] args) {
        List<Dog> dogs =  new ArrayList<>();
      //  dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new LabraDog());
        dogs.add(new GermanShe());


        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
//        animals.add(new Dog());
        animals.add(new Cat());
//        animals.add(new Dog());

//        animals.add(new Cat());


        List<Cat> cats = new ArrayList<>();

        cats.add(new Cat());

       // List<Object> obj = new ArrayList<>(); //
        //set extends point work down

      //  add(animals);
        copy(dogs,animals);
        print(animals);
    }

    //Only Reading are allowed
    //represent every  list as animal
    static void print(List<? extends Animal> animals){

        for(Animal a : animals){
            a.eat();
        }
    }

    static void add(List<? super Animal> value){

        value.add(new Animal());
//        for (Object obj : value){
//
//            Animal a = (Animal) obj;
//
//            a.eat();;
//        }

    }

    static void copy(List<? extends Dog> src, List<? super Animal> destination){

        for (Animal a  :src){
            destination.add(new Animal());
        }

    }
}

