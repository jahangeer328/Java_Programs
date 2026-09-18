package ChatGpt;

import java.util.Scanner;

enum ShapeType{
    CIRCLE,
    TRAINGLE,
    RECTANGLE;
}

class ShapeSelector{

    public static Shape getShape(ShapeType type){

        Shape shape = null;
        switch (type){
            case CIRCLE -> shape = new Circle();
            case TRAINGLE -> shape = new Traingle();
            case RECTANGLE -> shape = new Rectangle();

            default -> System.out.println("Select your Shape");
        }

        return shape;
    }
}
interface Shape{
    void area();

    default void show(){
        System.out.println("Hello Interface (~~)");
    }
}

class Circle implements Shape{

    @Override
    public void area(){
        System.out.println("Circle area ...");
        show();
    }

    @Override
    public void show(){
        System.out.println("Hello I am Cricle (~~)");
    }
}

class Rectangle implements Shape{

    @Override
    public void area(){
        System.out.println("Rectangle area ...");
        show();
    }

    @Override
    public void show(){
        System.out.println("Hello I am Rectangle (~~)");
    }
}

class Traingle implements Shape{

    @Override
    public void area(){
        System.out.println("Traingle area ...");
        show();
    }

    @Override
    public void show(){
        System.out.println("Hello I am Traingle (~~)");
    }
}
public class Shapes {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        String obj = null;
        while(true) {
            System.out.println("Enter Shape (CIRCLE , TRAINGLE , RECTANGLE) for Exit write (STOP) \n ..");
            obj = sc.nextLine().toUpperCase();

            if(obj.equals("STOP")){
                break;
            }

            try{
                Shape shape = ShapeSelector.getShape(ShapeType.valueOf(obj));
                shape.area();
            }catch (IllegalArgumentException E){
                System.out.println("||======== ==========||");
                System.out.println("|| Enter Valid Shape ||");
                System.out.println("||======== ==========||");
            }


        }

    }
}
