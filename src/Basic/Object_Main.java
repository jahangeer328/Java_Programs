package Basic;

import java.util.Objects;

class Demo2 extends Object implements Cloneable{
    String name;
    int age;

    public Demo2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
            protected Object clone() throws  CloneNotSupportedException{

        return super.clone();
    }
    Integer i = 28;
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        Demo2 d = (Demo2) obj;
        return (this.name == d.name && this.age == d.age );
    }

    @Override
    public int hashCode(){
        return Objects.hash(name , age);

//        int result = 17;
//        result = result * 31 + age;
//        result = result * 32  + ((name == null) ? 0 : name.hashCode());
//        return result;
    }
}
public class Object_Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Demo2 d1 = new Demo2("jahangeer", 21);
        Demo2 d2 = new Demo2("jahangeer", 21);
        Demo d = null;
        //System.out.println(d1.toString());
        System.out.println(d1.equals(d2));

        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

        System.out.println(d1.getClass().getName());

        System.out.println(d1 instanceof Object);

        Demo2 d3 = (Demo2) d1.clone();
        System.out.println(d3.name);
        System.out.println(d3.age);

    }
}
