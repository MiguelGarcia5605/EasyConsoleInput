import com.InputLib.Input;

public class Demo {

    public static void main(String[] args) {

        // getting text(string) from the console
        String textFromUser = Input.get_string("Enter a string:");

        // getting an integer(int) from the console
        int integerFromConsole = Input.get_int("Enter an integer: ");

        // getting a long from the console
        long longFromConsole = Input.get_long("Enter a long: ");

        // getting a double from the console
        double doubleFromConsole = Input.get_double("Enter a double: ");

        // getting a float from the console
        float floatFromConsole = Input.get_float("Enter a float: ");

        // getting true / false(boolean) from the console
        boolean booleanFromConsole = Input.get_bool("Enter a boolean: ");
    }

}
