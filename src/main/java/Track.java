public class Track {
    public static int counter = 0;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (counter <= 100) {
                System.out.println(Thread.currentThread().getName() + " value = " + counter++);
            }
        });
        Thread threadImplRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                while (counter <= 100) {
                    System.out.println(Thread.currentThread().getName() + " value = " + counter++);
                }
            }
        });
        thread.start();
        threadImplRunnable.start();
    }
}
