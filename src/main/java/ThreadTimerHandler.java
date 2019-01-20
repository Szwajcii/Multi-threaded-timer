import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class ThreadTimerHandler {

    private final List<Thread> threadList = new ArrayList<>();
    private final List<Timer> timerList = new ArrayList<>();
    private Map<String, Function> functions;

    public void start() {

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);


        while(isRunning){
            Message.displayMessage("Enter command:");
            String input = scanner.nextLine();
            String command = InputParser.getCommand(input);

            switch(command) {

                case "start":
                    runNewThread(input);
                    break;
                case "exit":
                    exitThreads();
                    break;
                case "check":
                    checkThread(input);
                    break;
                case "pause":
                    pauseThread(input);
                    break;
                case "resume":
                    resumeThread(input);
                    break;

            }
        }
    }

    private void runNewThread(String input) {

        String threadName = InputParser.getValue(input);

        if(checkIfExist(threadName)){

        }


        Timer timer = new Timer(threadName);
        Thread thread = new Thread(timer, threadName);

        this.timerList.add(timer);
        this.threadList.add(thread);
        thread.start();

    }


    private void exitThreads(){

        for(Thread thread : this.threadList){
            thread.interrupt();
        }

        this.timerList.forEach(s -> s.toString());
        this.timerList.clear();


    }


    private boolean checkIfExist(String threadName){

        for(Thread thread : this.threadList){
            if(thread.getName().equals(threadName)){
                return true;
            }
        }

        return false;
    }

    private void interruptThread(String threadName){

        for(Timer timer : this.timerList){
            if(timer.getName().equals(threadName)){
                timer.interruptThread();
                this.timerList.remove(timer);
            }
        }

    }

}
