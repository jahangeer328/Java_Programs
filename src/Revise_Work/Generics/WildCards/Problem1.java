package Revise_Work.Generics.WildCards;


class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }

    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends  Animal{

    @Override
    void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    void sleep(){
        System.out.println("Dog is sleeping");
    }
    boolean bark(){
        System.out.println("Only Dog Can Bark..");
        return false;
    }
}

class LabraDog extends Dog{

}

class Germanshe extends Dog{

}


class Cat extends  Animal{

}
public class Problem1 {
    public static void main(String[] args) {

       // List<Dog> dogs = new ArrayList<>();

       // List<Animal> animals = dogs; // parent can't point in generics
        //Generics is invariant
        //in Normal case Dog is child of ANIMAL
        //BUT IN generics list of Dog is not child of list of animal

        Dog [] dogs = new Dog[10];

        Animal [] animals = dogs; //not give an error

        animals [0] = new Dog();
        animals [1] = new Dog();
        animals [2] = new Dog();
        animals [3] = new Dog();
        animals [4] = new Dog();
        animals [5] = new Dog();
        animals [6] = new Animal();


        for (Animal a: animals){
            a.eat();
        }

    }
//
     //for friend name is Aijaz
//    static void fun(){
//        java.util.Scanner scanner = new Scanner(System.in);
//        System.out.println("Edge case break with 0");
//        int edge = scanner.nextInt();
//
//        if(edge == 0)
//            return ;
//
//        System.out.println("Enter no  :");
//        int a = scanner.nextInt();
//        System.out.println("Enter no  :");
//        int  b= scanner.nextInt();
//      calculate(a,b) ;
//
//
//    }
//
//    static void calculate(int a, int b){
//      String str = a + b + "\n" +( a / b) + "\n" + (a - b) +"\n" +  ( a * b);
//        System.out.println(str);
//        fun();
//
//    }

}
