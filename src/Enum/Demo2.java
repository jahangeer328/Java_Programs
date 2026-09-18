package Enum;
// BY DEFAULT ENUM IS STATIC AND FINAL
//IT ALSO RELATE WITH CLASS NOT OBJECT
//SOLVE TYPE SAFETY PROBLEM
//enum own functions name() , ordinal() , compiler create values() which helps to iterate
//enum type array create
//VALUESOF() FUNCTION IT TAKES String inside check enum type




enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("move up (y+1)");
        }
    },
    SOUTH {
        @Override
        public void move(){
            System.out.println("move Down (y-1)");
        }
    },
        EAST{
            @Override
            public void move(){
                System.out.println("move right (x+1)");
            }
        },
            WEST{
                @Override
                public void move(){
                    System.out.println("move left (x-1)");
                }
            } ;
                public abstract void move();

//     int i;
//
//
//    Direction(int i) {
//        this.i = i;
//    }
            }

            enum DaysOfWeek {
                MONDAY,
                TEUSDAY,
                WEDNESDAY,
                THURSDAY,
                FRIDAY,
                SATURDAY,
                SUNDAY;

            }

            enum TrafficLight {
                RED, YELLOW, GREEN;


            }
            public class Demo2 {
                public static void main(String[] args) {

                    Direction d = Direction.EAST;
                    d.move();
                    //String status = "WATER";
////        TrafficLight trafficLight = TrafficLight.valueOf(status);
////
////        switch (trafficLight){
////            case RED -> System.out.println("STOP");
////            case GREEN -> System.out.println("GO");
////            case YELLOW -> System.out.println("READY");
////            default -> System.out.println("PLEASE WAIT");
////        }
//                    Direction d = Direction.SOUTH;
//                    System.out.println(d);
////
////          DaysOfWeek daysOfWeeks [] = DaysOfWeek.values();
////
////          for(DaysOfWeek days : daysOfWeeks){
////              System.out.println(days.ordinal()  + " =-> " + days.name());
////          }
//
//                }
//            }
        }
    }



