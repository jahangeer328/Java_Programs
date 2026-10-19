package ChatGpt.Generics;

/*
What is the purpose of Generics in java? Explain with a example.
Ans : Generics introduced in java 5,it main purpose is type safety ,less manual casting ,error
checked at compileTime , no more same code no need to write same code changing data types
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Animal{

    void eat(){
        System.out.println("Animal is Eating");
    }

    void run(){
        System.out.println("Animal is Running");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println("Dog is Barking");
    }

    @Override
    void eat(){
        System.out.println("Dog is Eating");
    }
}

class LabraDog extends Dog{

}
class  Cat{

}
public class WildCards {
    public static void main(String[] args) {

       List<Animal> animals = new ArrayList<>();
       animals.add(new Animal());
       animals.add(new Animal());
      // animals.add(new Dog());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
       // dogs.add((Dog) new Animal());

       // print(d);
        //print3(dogs);

        print4(dogs);

        List<? super Animal> list = new ArrayList<>();
        list.add(new LabraDog());
        list.add(new Dog());
        list.add(new Animal());


    }

    //Learning 5 with wildcard and lower bound (bottom to up)
    public static void print5(List<? super Animal> animals){
        animals.add(new Dog());
        animals.add(new Animal());
        animals.add(new LabraDog());

    }
    //Example 4 with generics , wildcard with upperBound just Reading is possible
    public static void print4(List<? extends Animal> animals)
    {
       // animals.add(new Dog());
        for (Animal animal : animals){
            animal.eat();
        }
    }
    //Example 1 without Generic , parent also can point child, easily i can pass here child reference
    public static void print(Animal animal){
        animal.eat();
    }

    //Example 2 with Generic , when I pass list of dogs to the list of animals it gives compile time error
    //classCastException

    public static void print1(List<Animal> animals){
        animals.add(new Animal());
        animals.add(new Animal());
         for (Animal a : animals){
             a.eat();
         }
    }

    //Example 3 with Generics and Wildcard which introduced in java 5 symbol<?>
    public static void print3(List<?> values){
        for (Object obj : values){
            System.out.println(obj.getClass().getName());
        }
    }



}


/*
Generic is invariant where parent and child relationship will break
parent do not point child object,
solve this problem wild card introduced in java generics
 */
