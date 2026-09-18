package Generics;
//WildCards

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
class Animal ==> eat(), sleep()
class Dog extends Animal ==> bark()
 */
class Animal1 {

    void eat(){
        System.out.println("Eating");
    }

    void sleep(){
        System.out.println("Sleeping");
    }
}

class Dog1 extends Animal1{
    void bark(){
        System.out.println("Barking");
    }

}
public class Day3Main {
    public static void main(String[] args) {

//        List<Dog1> dogs = new ArrayList<>();
//
//        List<Animal1> animals = dogs;
        //Not possible in generis it give compile time exception ,

        Dog1 [] dog1s = new Dog1[5];

        Animal1 [] animal1s;
        animal1s = dog1s;

        animal1s[0] = new Dog1();
        animal1s[1] = new Dog1();
        animal1s[2] = new Dog1();
        animal1s[3] = new Dog1();
        animal1s[4] = new Animal1();


        for (Dog1 dog1 : dog1s){
            if(dog1 == null){
                continue;
            }
            dog1.bark();
        }

    }
}
