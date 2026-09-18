package ChatGpt;

enum TrafficLight{
    RED("STOP"),YELLOW("GO"),GREEN("READY");

    private String action;

    TrafficLight(String action){
        this.action = action;
    }

    public String getAction(){
        return action;
    }
}
public class TrafficLightAction {
    public static void main(String[] args) {
        TrafficLight [] trafficLight  = TrafficLight.values();

        for (TrafficLight t : trafficLight){
            System.out.println(t.ordinal() + " -> " + t.name() + " -> " + t.getAction());
        }
    }
}
