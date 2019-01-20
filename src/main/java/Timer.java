

public class Timer  implements Runnable{

    private String name;
    private int id;
    private static int threadId = 0;
    private long startTime;
    private long elapsedTime;
    private long pause = 0;
    private volatile boolean isThreadRun = true;
    private final int TIME_DIVIDER = 1000000000;


    public Timer(String name) {
        this.name = name;
        this.id = this.threadId++;
    }


    public String getName(){
        return this.name;
    }

    public void interruptThread(){
        Thread.currentThread().interrupt();
    }

    public synchronized void resumeThread(){
        long endTime = System.nanoTime();
        this.isThreadRun = true;
        this.startTime = startTime + (endTime - pause);
        this.pause = 0;
    }

    public void run() {
        this.startTime = System.nanoTime();

        while(true){
            if(this.isThreadRun){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    stopTime();
                    throw new RuntimeException();
                }
            }
        }
    }

    public void pasueTime() {
        this.isThreadRun = false;
        this.pause = System.nanoTime();
    }

    public void stopTime() {

        long endTime = System.nanoTime();

        if(this.pause != 0){
            this.elapsedTime = ((endTime - this.startTime) - (endTime - this.pause)) / TIME_DIVIDER;
            return;
        }

        this.elapsedTime = (endTime - this.startTime) / TIME_DIVIDER;
    }

    public String toString(){

        return "NAME: " + this.name + ", ThreadId: " + this.id + ", Seconds: " + this.elapsedTime;
    }
}
