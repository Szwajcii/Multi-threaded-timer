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
                    runNewThread(command);
                    break;
                case "exit":
                    exitThread();
                    break;
                case "check":
                    checkThread(command);
                    break;
                case "pause":
                    pauseThread(command);
                    break;
                case "resume":
                    resumeThread(command);
                    break;

            }


        }


    }

}
