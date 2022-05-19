import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    protected int min, max;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int r;

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    r = random.nextInt((max - min) + 1) + min;
                    return r;
                }
                return null;
            }

            @Override
            public void remove() {

            }
        };
    }
}


//    protected PrimitiveIterator.OfInt randomIterator;
//    protected int min, max;
//
//    public Randoms(int min, int max) {
//        randomIterator = new Random().ints(min, (max + 1)).iterator();
//        this.min = min;
//        this.max = max;
//    }
//
//    @Override
//    public Iterator<Integer> iterator() {
//        return new Iterator<>() {
//            @Override
//            public boolean hasNext() {
//                return true;
//            }
//
//            @Override
//            public Integer next() {
//                return randomIterator.nextInt();
//            }
//        };
//    }

