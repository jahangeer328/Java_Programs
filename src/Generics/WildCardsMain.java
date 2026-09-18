package Generics;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildCardsMain {

    public static void main(String[] args) {

        List<Dog1> dog1s = new ArrayList<>();

        dog1s.add(new Dog1());
        dog1s.add(new Dog1());

        fun(dog1s);

        List<Animal1> animal1s = new ArrayList<>();

        animal1s.add(new Animal1());
        animal1s.add(new Animal1());

        fun(animal1s);
    }

    static void fun(List<?> value){
        for (Object obj : value){
            System.out.println(obj.getClass().getName());
        }
    }

}

