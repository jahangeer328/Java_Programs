package Revise_Work.Generics;

//UpperBound
//<T extend className>
class Table<T extends Number>{
    T value;

    Table(T value){
        this.value = value;
    }
}

//<T extends className & interface1,interface2,n>
class Table2<T extends  Animal & Swimable>{
    T value;

    Table2(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}

public class Practice {
    public static void main(String[] args) {

        Fish f = new Fish();
        Table2<Fish> t1 = new Table2<>(f);
        System.out.println(t1.getValue());

    }
}

interface Swimable{
    void swim();
}

class Animal{
    void display(){
        System.out.println("Displaying Animal...");
    }
}

class Dog extends  Animal{

    void bark(){
        System.out.println("Dog is barking ..");
    }
}

class Fish extends Animal implements Swimable{
    @Override
    public void swim(){
        System.out.println("Fish Swim in Sea..");
    }
}


