package Revise_Work.Generics.WildCards;

import java.util.ArrayList;
import java.util.List;

public class ProblemUsingNormalWildCards {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        //I can't do like that
            //  List<Animal> animalList = dogs;
                                                //Generics is invariant , parent and child relationship will break
                                                //parent do no point child object in generics

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        //Expected list of animal do not allow to pass ay other link
       // printList(dogs);

        //normal wild card

      //  printList(animals);
    }

    //problem
    //can't pass child Object
//    static void printList(List<Animal> animalList){
//
//        for (Animal a : animalList){
//            a.sleep();
//        }
//
//    }

    //problem with normal wildcards
    //i can pass any list but
    //not allows writing only reading but just help of object class
//    static void printList(List<?> values){
//
//       // values.add("Hello");// writing not allows
//        for (Object obj :  values){
//            System.out.println(obj.getClass().getName());
//        }
//    }


    //


}
