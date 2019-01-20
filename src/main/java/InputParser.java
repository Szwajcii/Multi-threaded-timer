import java.util.InputMismatchException;

public class InputParser {

    public static String getCommand(String input){

        String[] command = input.split(" ");
        return command[0].trim();
    }


    public static String getValue(String input) {
        String[] command = input.split(" ");

        if(command.length > 1){
            return command[1].trim();
        }

        else {
            throw new InputMismatchException("Wrong input!");
        }

    }

}
