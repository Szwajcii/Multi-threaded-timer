

public class Timer  implements Runnable{

    private String name;
    private int id;
    private static int threadId = 0;
    private long startTime;
    private long endTime;
    private long pasue = 0;
    private volatile boolean isThreadRun = true;


    public Timer(String name) {
        this.name = name;
        this.id = this.threadId++;
    }


    public String getName(){
        return this.name;
    }


    public void run() {

    }
}
