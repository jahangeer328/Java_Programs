package J_C_F;

import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Farhan");
        list.add("Ameer");
        list.add("Ashraf");

        List<Integer> it = new ArrayList<>();
        it.add(3);

        Iterator<Integer> str =  it.iterator();

        System.out.println(list);

//        for (String i : list){
//            if(i == 50){
//                list.remove(i);
//            }
//        }
//
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equalsIgnoreCase("ali")){
                list.remove(i);
            }
        }
//
        System.out.println(list);
    }
}
