import java.util.concurrent.*;

public class LinkedBlockingQueueTest {

    public static void main(String[] args) throws InterruptedException {
        long time = System.currentTimeMillis();
        try {
            //LBQ => 10777ms
            ExecutorService pool = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS,
                    new LinkedTransferQueue<>());
            for (int i = 0; i < 10_000_000; i++) {
                pool.submit(() -> { });
            }
            pool.shutdown();
            while (!pool.awaitTermination(1, TimeUnit.SECONDS)) ;
        } finally {
            time = System.currentTimeMillis() - time;
            System.out.println("time = " + time + "ms");
        }
    }
}
