package Generics;
//upper Bound

class Animal{
    void display(){
        System.out.println("Animal displayed ...");
    }
}

class Dog extends Animal{

}

interface Swimable{
    void swim();
}
class Fish extends Animal implements Swimable{
    @Override
    public void swim(){
        System.out.println("Fish Swim");
    }
}
class Box2<T extends Animal & Swimable>{
    T value;

//    Box2(T value){
//        this.value = value;
//    }

}


//public class Day2Main {
//    public static void main(String[] args) {
//
//
//        Box2<Fish> box2 = new Box2<>();
//
//    }
//}


