import java.io.PrintStream;
import java.util.Scanner;

public class UI {
    private final static PrintStream WRITER = System.out;
    private final static Scanner READER = new Scanner(System.in);

    public static void write(String string) {
        WRITER.println(string);
    }

    public static String read() {
        return READER.nextLine();
    }
}