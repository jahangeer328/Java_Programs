package CollectionFrameWrok;

//Collection Framework is used to store data
//there is a lot of classes used in C-F to stored objects,data

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;
import java.util.stream.Gatherer;

/*

 */
public class Demo {
    public static void main(String[] args) {

        HashSet<Object> list = new HashSet<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);


      Iterator<Object> it  =  list.iterator();

      while(it.hasNext()){
          System.out.println(it.next());
      }
    }
}
