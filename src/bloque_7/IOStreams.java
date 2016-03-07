package bloque_7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author alonsocucei
 */
public class IOStreams {
    public static void main(String[] args) throws IOException {
        String inputFile = System.getProperty("user.home") + "\\Desktop\\input file.txt";
        String outputFile = System.getProperty("user.home") + "\\Desktop\\output file.txt";

        //reading a file
        FileInputStream reader = new FileInputStream(inputFile);
        int character;
        
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        
        reader.close();
        
        //writing to a file
//        FileOutputStream writer = new FileOutputStream(outputFile);
//        writer.write("Hello world of IO streams".getBytes());
//        writer.close();
        System.out.println(Arrays.toString("hola mundo".getBytes()));
    }
}

/**
 * To check:
 * - What data types streams classes read/write?
 * - What other classes are available?
 */