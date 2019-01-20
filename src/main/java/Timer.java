

public class Timer  implements Runnable{

    private String name;
    private int id;
    private static int threadId = 0;
    private Long startTime;
    private Long endTime;
    private long pasue = 0;
    private volatile boolean isThreadRun = true;


    public Timer(String name) {
        this.name = name;
    }


    public void run() {

    }
}
