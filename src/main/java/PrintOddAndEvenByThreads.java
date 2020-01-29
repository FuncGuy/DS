public class PrintOddAndEvenByThreads implements Runnable {

    static boolean isEven;
    static boolean isOdd;
    int count = 0;
    Object monitor = new Object();

    static int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void printEven() throws InterruptedException {
        while(count <= a.length) {
            synchronized (monitor){
                while(isEven){
                    monitor.wait();
                    for(int i = 0; i < a.length; i++){
                        if(a[i] % 2 == 0){
                            System.out.println("Printing Even " + a[i]);
                            isOdd = true;
                            count++;
                            monitor.notify();
                        }
                    }

                }
            }
        }
    }

    public void printOdd() throws InterruptedException {

        while(count <= a.length) {
            synchronized (monitor){
                while(isOdd){
                    monitor.wait();
                    for(int i = 0; i < a.length; i++){
                        if(a[i] % 2 != 0){
                            System.out.println("Printing Odd " + a[i]);
                            isEven = true;
                            count++;
                            monitor.notify();
                        }
                    }

                }
            }
        }
    }



    public static void main(String[] args) throws InterruptedException {

        PrintOddAndEvenByThreads oddAndEvenByThreads = new PrintOddAndEvenByThreads();

        Thread t1 = new Thread(new PrintOddAndEvenByThreads());

        Thread t2 = new Thread(new PrintOddAndEvenByThreads());

        //isEven = true;
        isOdd = true;

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        try {
            printEven();
            printOdd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
