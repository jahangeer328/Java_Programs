package CollectionFrameWrok;

import java.util.Iterator;

class IntegerContainer implements Iterable<Integer>{
    private int [] numbers;
    private int size;

    IntegerContainer(int [] numbers){
        this.numbers = numbers;
        this.size = this.numbers.length;
    }

    @Override
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            int pos = 0;
            @Override
            public boolean hasNext() {
                return pos < size;
            }

            @Override
            public Integer next() {
                return numbers[pos++];
            }


        };
    }

}
public class Main {
    public static void main(String[] args) {

        int [] no = {1,2,3,4,5};

        IntegerContainer integers = new IntegerContainer(no);

        Iterator<Integer> it = integers.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + "  ");
        }

    }
}
