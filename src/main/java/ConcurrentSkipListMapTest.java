import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;



public class ConcurrentSkipListMapTest {

    public static void main(String[] args) {

        Map<Integer, Long> squares = new Hashtable<>();
        long time = System.currentTimeMillis();
        try {
            IntStream.range(0, 10_000_000).parallel()
                    .forEach(i -> squares.put(i, ((long) i) * i));
        } finally {
            time = System.currentTimeMillis() - time;
            System.out.println("time = " + time + "ms");
        }

        System.out.println("GET");

        long time2 = System.currentTimeMillis();
        try {
            IntStream.range(0, 10_000_000).parallel()
                    .forEach(i -> squares.get(i));
        } finally {
            time2 = System.currentTimeMillis() - time2;
            System.out.println("time = " + time2 + "ms");
        }





    }
}
