package lv.rcs.bootcamp.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

import static java.util.Arrays.asList;


//http://tutorials.jenkov.com/java-io/overview.html

//The java.io package has classes that support both character streams and byte streams. You can
//use character streams for text-based I/O. Byte streams are used for data-based I/O. Character streams
//for reading and writing are called readers and writers, respectively (represented by the abstract classes
//of Reader and Writer). Byte streams for reading and writing are called input streams and output streams,
//respectively (represented by the abstract classes of InputStream and OutputStream)
public class IoExample {

    public static void main(String[] args) throws IOException {
        System.out.println("======= read from file ======");
        readFromFile();

        System.out.println("======= write to file ======");
        writeToFile();

        System.out.println("======= write to stdout (console) ======");
        writeToStdout();

        System.out.println("======= read from stdin (console) ======");
        readFromStdin();

        writeToStdErr();
    }

    static void writeToStdErr() {
        System.err.println("Writing to stderr");
    }

    static void writeToStdout() {
        PrintWriter writer = new PrintWriter(System.out, true);

        List<String> names = asList("Foo", "Bar");
        for (String name : names) {
            writer.println(name + " ");
            //writer.flush();
        }
        //this will close stdout and System.out.println won't output anything
        //anymore
        //writer.close();
    }

    static void readFromStdin() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = reader.readLine()) != null && s.length() != 0) {
            //this writes to stdout (console)
            System.out.println(s);
        }
    }

    //reads from file and writes to console
    static void readFromFile() throws IOException {
        String fileName = "bootcamp.txt";
        File myFile = new File(fileName);
        if (!myFile.exists()) {
            throw new FileNotFoundException("please create file " + fileName
                    + " (in project root directory, if running from IntelliJ");
        }
        BufferedReader reader = new BufferedReader(new FileReader(myFile));
        String s;
        while ((s = reader.readLine()) != null && s.length() != 0) {
            //this writes to stdout (console)
            System.out.println(s);
        }
        reader.close();
    }

    //write to file
    static void writeToFile() throws IOException {
        String fileName = "bootcamp-write-example.txt";
        File myFile = new File(fileName);
        if (!myFile.exists()) {
            System.out.println("creating file " + fileName);
            myFile.createNewFile();
        }
        PrintWriter writer = new PrintWriter(fileName);
        String s;
        List<String> names = asList("Foo", "Bar");
        for (String name : names) {
            writer.println(name + " ");
            //writer.flush();
        }
        System.out.println("Done writing to file!");
        writer.flush();
    }
}
