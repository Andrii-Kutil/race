import org.apache.log4j.Logger;

public class Track {
    public static int counter = 0;
    private static final Logger logger = Logger.getLogger(Track.class);

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (counter <= 100) {
                logger.info(Thread.currentThread().getName() + " value = " + counter++);
            }
        });
        Thread threadImplRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                while (counter <= 100) {
                    logger.info(Thread.currentThread().getName() + " value = " + counter++);
                }
            }
        });
        thread.start();
        threadImplRunnable.start();
    }
}
