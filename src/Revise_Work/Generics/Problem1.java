package Revise_Work.Generics;

import java.util.Objects;

//if I create a class which hold one type data
//every type of data , creating lots of classes every type of model
//using object class we will make the universal class which hold every type data
//
class Test{

    private Object data;

    public Test(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Object setData(Object data) {
      return this.data = data;
    }
}


class Test2<T>{ // T is type parameter

    private T data;

    public Test2(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public T setData(T data) {
        return this.data = data;
    }
}
public class Problem1 {
    public static void main(String[] args) {


        //integer Holder
//        Test t1 = new Test(20);//her type ki data ke lye alag class or holder banana parhega
        //lots of class will create waste of memory

        //Using Object Class

        Test t0 = new Test("hello");
        Test t1 = new Test(300);
        Test t2  = new Test(true);

        //you can't perform any operation on these object in data
        //q ke compiler ko nhi pata ke kia hai object main
//        System.out.println(t1.getData() + 5);

        String s =(String) t0.getData();
        Integer i = (Integer) t1.getData();
        Boolean b = (Boolean) t2.getData();

        //ab yahan tak ye sare masle hal ho gye
        //1 kuchh bhi store ker sakte hoo ek hi class ka use kerke
        //2 lots of manual casting kerke operation bhi perfomr ker sakte ho

        //but it will create new problem for developers;

        int a = 200;
        //String s1 = (String) t1.setData(a);
        //toh masla tha ye object to runtime pe resolve hoga compiler ko to pata hi nhi ke object
        //main kis type ki data hai
        //or agar object main integer ki data ho or tum ne manual casting kerke
        //use string main typecast ker diya to kia hoga
        //to hoga ye ke tumhe runtime pe tumhara code phat jayega
        //aur agar man lo yeh code tumhara production level pe chal rha ho
        //to man user data fill kerta hai apka apka Object manual cast hai String main
        //ab use data de rha hai use Integer main toh user ko torhi compiler time error
        //dega humain hi nhi dega error at compile time pe
        //to socho kia hoga jub data hamare code se hoke database main store hoga
        //it will give runtime Exception which is classCastException
        //application will crash

        //error compile time wale behter hain
        //runtime wale error se

        //toh is probelm ko hal kerne ke liye 2004 main shayed java 5 main generics introduce huwe
        //to generics is general purpose class that work with any type of data


        Test2 test2 = new Test2(3034);//toh yahan tak bhi comiler is object hi samjhe ga

        Test2<Integer> test3 = new Test2<>(300);//or ab yahan tum test3 ke object main String store nhi ker sakte
        Test2<String> test4 = new Test2<>("Hello");//or yahan integer nhi store ker sakte

        //or yahan agar tumne

        //String s5 =(String) test3.getData();//kisi or type ke object ko String main typecast nhi kerne dega generic
                                    //bolge are bha string ke box main ye integer kahan daal rhe ho

        //toh yahan tak hum alag alag data store kerwane ke lye seperate classes nhi bana rhe balke ek new object bana rhe hain
        //her object apni type ki data ke sath kaam kerega or kisi ke sath nhi
        //yahan pe

        //generics nhi boht sare masle hul ker diya
        //galat typecasting nhi kerne doonga
        //class kum ker di her type ki data ke lye
        //less manual casting
        //object ko pata hoga ke mujhe sirf us type argument store hoga jo type parameter main given hoga
        data("JK", 21, "NA");

        form(21, "jAHANGEER", "Nisar Ali");

    }

    //function hai jo tumse tumhara nam,age,baba ka naam leta hai
    //main chahta hoo aga data kahe or se alag format main
    //naam ki jagha age , age ke jgha nam,aa rha hai to error na aye

    static String data(String name, int age, String fname){
        return name +  " " + age + " " + fname;
    }

    static <T,U,V> void form(T name, U age, V fname){
        System.out.println(name + "  :" + age +" : "+" fname");
    }

}
