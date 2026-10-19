package Revise_Work.Generics.WildCards;

class Box<T>
{
   private  T data;

   Box(T data){
       this.data = data;
   }

   public  T getData(){
       return data;
   }

}
public class Main {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Ali");

        Box<Integer> integerBox = new Box<>(20);


        String name = stringBox.getData();
        Integer age = integerBox.getData();


        System.out.println(name.length());
        System.out.println(age  + 5);


       // String wrong = integerBox.getData();
        //intger holder container , which i want store in string it not allow
        //it break types that is why it's not allowed it gives compile time error
        //if my answer is ok or you can modifeids
    }
}
