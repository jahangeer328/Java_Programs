package Revise_Work.Generics;

public class Main {

    //Generics Methods
    public  static  <T ,U> void  fun(T value, U value2){
        System.out.println(" Hey !!  :" + value + " Hello : " + value2 );
    }
    public static void main(String[] args) {
     fun(1000.43,"Jahangeer");

      //  Box b = new Box(10); // int
      //  Box b = new Box("Hello");//it will expecting int not an string

        // using object class

//        Box b = new Box("hello");// it will accept every type of data
//        Box b1 = new Box(10);
//        Box b2 = new Box(100.4);
//        Box b3 = new Box(10.0f);
//        Box b4 = new Box(true);

        //errors
//        System.out.println(b.getValue() + 5);
//        System.out.println(b1.getValue() + 5);
//        System.out.println(b2.getValue() + 5);
//        System.out.println(b4.getValue()+5);

//        Integer x = (Integer) b.getValue();
//        System.out.println(x + 5);

        //too generic = tye information will lost
        //if data coming from file,api call then this down casting is very dangerous
        //it will cause of runtime Exception which is ClassCastException
        //although for production level this will not prefer this
        //at production level use of generic is safe
        //because of
        // no manual casting, no runtime Exception  cast, code reusability increase
        //decrease memory usage


        //Using generics
//        Box<String> b1 = new Box<>("    Hello  ");
//        System.out.println(b1.getValue().trim());
//        Box<Integer> b2 = new Box<>(2000);
//        System.out.println(b2.getValue() + 4000);
//        Box<Boolean> b3 = new Box<>(true);
//        System.out.println(b3.getValue());

        //pass type parameter, two
//        Pair<String, Integer> p1 = new Pair<>("Jahangeer",2000);
//        System.out.println(p1.x + "  , " + p1.y);
    }
}

class Box<T>{

    private T value;

    Box (T value){this.value = value;}

    public T  getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Pair<T,U>{
    T x;
    U y;

    Pair(T x , U y){
        this.x = x;
        this.y = y;
    }
}


