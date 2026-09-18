package Enum;
//enum also contain fields and behaviors
enum ProcessState{
    RUNNING("IN RUNNING"),
    WAITING("IN WAITING"),
    STOPPED("IN STOPPED"),
    FINISHED("IN FINISHED");

    private String message;

    ProcessState(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }


}
public class Game {
    public static void main(String[] args) {

        ProcessState  [] state =  ProcessState.values();


        for (ProcessState p : state){
            System.out.println(p.ordinal() + " -> " +p.name());
            System.out.println(p.getMessage());
        }


    }
}
