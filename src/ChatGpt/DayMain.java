package ChatGpt;

enum Day{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
public class DayMain {
    public static void main(String[] args) {

        Day day [] = Day.values();

        for (Day d  : day){
            System.out.println(d.ordinal() + " - >" + d.name());
        }
    }
}
