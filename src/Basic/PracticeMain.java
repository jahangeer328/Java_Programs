package Basic;


import java.sql.SQLOutput;
import java.util.Objects;

public class PracticeMain {
    public static void main(String[] args) {

        Practice p1 = new Practice("ameen",31);

        System.out.println(p1.toString());

        Practice p2 = new Practice("ameen",31);


        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode() +" , " +  p2.hashCode());

        System.out.println(p1 instanceof Object);

        System.out.println(p1.getClass().getName());


    }
}
class Practice extends Object {

    String name;
    int age;

    public Practice(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString (){
    return name + " , " + age;
}

@Override
   public boolean equals(Object obj){

    if(obj == null){
        return false;
    }
    Practice p = (Practice) obj;

    return (this.name == p.name && this.age == p.age);
}

@Override
    public int hashCode(){
//        return Objects.hash(name, age);
    int result  = 17;
    result = result *17 + age;
    result = result * 32 + ((name == null) ? 0 : name.hashCode());
    return result;
}


}
//core method of Object class which is also known as parent of all classes
/*
1.toString method
                : this method convert any object to String or any object representation in String
2.equals()
            : it compare two references  which store in stack which holds the address of it object which store in heap memory
3.hashCode()
            ; it compare two object and give her object are same and equals() are true it will give same hashcode value
4.getClass()
            : it gives
 */
