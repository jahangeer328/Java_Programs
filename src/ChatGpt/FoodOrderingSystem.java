package ChatGpt;

enum FoodType{
    BURGER,PIZZA,SANDWICH;
}

interface Food{
    void prepareFood();
}

class FoodFactoryDesign{

    public static Food getOrderFood(FoodType foodType){

        Food food = null;
        switch (foodType){
            case BURGER -> {
                 return new Burger();
            }
            case PIZZA -> {
                return new Pizza();
            }

            case SANDWICH -> {
                return new Sandwich();
            }

            default -> System.out.println("Nothing is Ready !!");
        }

        return food;
    }
}

class Burger implements Food{

    @Override
    public void prepareFood(){
        System.out.println("Burger is now ready !");
    }
}
class Pizza implements Food{

    @Override
    public void prepareFood(){
        System.out.println("Pizza is now ready !");
    }
}

class Sandwich implements Food{

    @Override
    public void prepareFood(){
        System.out.println("Sandwich is now ready !");
    }
}
public class FoodOrderingSystem {
    public static void main(String[] args) {


        Food food = FoodFactoryDesign.getOrderFood(FoodType.SANDWICH);

        food.prepareFood();
    }
}
