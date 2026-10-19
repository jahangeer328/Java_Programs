package Revise_Work.Generics.WildCards;

//import ChatGpt.Generics.*;

import java.util.ArrayList;
import java.util.List;

public class UseOfWildCards {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(23);
        nums.add(45);
        nums.add(67);
        List<? extends Number>  ls2 = nums;
       // ls2.add(45);

        for (Number n : ls2){
            System.out.println(n);
        }


        List<Animal> animals = new ArrayList<>();

       // List<Dog> dogs = new ArrayList<>();

        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Animal());

        print(animals);

        List<?> list = new ArrayList<String>();
        list.add(null);
        Object obj  = list.get(0);
        System.out.println(obj);

        //kum se kum jo main aage paass keroonga wo animal main jayega;

        List<? extends Animal> ls = new ArrayList<Dog>();


    }

    //using extends you can read only not writing
    static void print(List<? extends Animal> animals){
        for (Animal a : animals){
            a.eat();
        }
    }

   // Animal <--- Dog <-- LabraDog
   //         Dog <--- Germanshe
    static void print1(List<? super Animal> dogs){

        dogs.add(new Dog());
        dogs.add(new LabraDog());
        dogs.add(new Animal());
        dogs.add(new Cat());


    }






}

