import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String pathToFileWeAreCreating = "C:\\Users\\Admin\\Desktop\\Example replace.txt";
        replaceSystemOut(pathToFileWeAreCreating);
    }

    public static void replaceSystemOut(String pathToFile) throws FileNotFoundException { 
        PrintStream printStream = new PrintStream(new File(pathToFile)); 
        
        PrintStream ourIDEAConsole = System.out;

        System.setOut(printStream);
        System.out.println("This line writing to the file...");

        System.setOut(ourIDEAConsole);
        System.out.println("This line writing to the console...");
    }
}
