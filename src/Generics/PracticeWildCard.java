package Generics;

import java.util.ArrayList;
import java.util.List;

public class PracticeWildCard {
    public static void main(String[] args) {

        List<Animal1> animal1s = new ArrayList<>();

        animal1s.add(new Animal1());
        animal1s.add(new Animal1());

        print(animal1s);
    }

    static void print(List<?> value){
        for (Object obj : value){
            System.out.println(obj.getClass().getName());
        }
    }
}
