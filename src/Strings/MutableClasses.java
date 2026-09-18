package Strings;
//b/c String is immutable which is cause of
//heavy memory usage and slow, but thread safe
public class MutableClasses {

    public static void main(String[] args) {

                         //String Builder --> mutable,thread safe not
    //AbstractStringBuilder    . parent of both
                         //String buffer --> mutable ,thread safe yes

        StringBuilder sb = new StringBuilder();//initially capacity 16
        sb.append("Jahangeer").append(" Lashari");


//
//        sb.insert(2,'m');
//
//        sb.deleteCharAt(2);
//        System.out.println(sb);

        System.out.println(sb.capacity());



    }
}
