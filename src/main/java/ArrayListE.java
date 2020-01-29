import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ArrayListE {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("world");
        ScheduledThreadPoolExecutor ex = new ScheduledThreadPoolExecutor(5);
        ex.setRemoveOnCancelPolicy(true);


    }
}
