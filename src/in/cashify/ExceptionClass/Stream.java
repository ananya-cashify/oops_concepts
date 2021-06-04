package in.cashify.ExceptionClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Stream {




   

        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("text.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            System.setOut(new PrintStream(fileOutputStream));
            System.out.println("IO example");
        }

    }

