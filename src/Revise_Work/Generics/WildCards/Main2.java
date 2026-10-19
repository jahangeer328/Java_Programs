package Revise_Work.Generics.WildCards;

class Pair<T , U>{

    private T first;
    private U second;

    Pair(T first , U second){
        this.first= first;
        this.second = second;
    }


    public T getFirst(){
        return first;
    }

    public U getSecond(){
        return second;
    }
}


public class Main2 {

    public static void main(String[] args) {

        Pair<String , String> pair = new Pair<>("Java" , " Generics");

        Pair<Integer , Integer> pair2 = new Pair<>(10 , 20);


        Pair<String , Integer> pair3 = new Pair<>("Java" , 36);

        Pair<String , Integer> pair4 = new Pair<>("Type inferred" , 20);

        System.out.println(pair.getFirst() +  " , " + pair.getSecond());
        System.out.println(pair2.getFirst() +  " , " + pair2.getSecond());
        System.out.println(pair3.getFirst() +  " , " + pair3.getSecond());
        System.out.println(pair4.getFirst() +  " , " + pair4.getSecond());


        //There is no need to give type in angular braces compiler detect it references
        //java inferred the types


        var Pair = new Pair<>("jahangeer" , 22);
    }

}
