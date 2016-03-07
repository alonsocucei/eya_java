package bloque_7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author alonsocucei
 */
public class ReadersAndWriters {

    public static void main(String[] args) throws IOException {
        String inputFile = System.getProperty("user.home") + "\\Desktop\\input file.txt";
        String outputFile = System.getProperty("user.home") + "\\Desktop\\output file.txt";

        //reading a file
        FileReader reader = new FileReader(inputFile);
        int character;
        
        while ((character = reader.read()) != -1) {
            System.out.print((char) character);
        }
        
        reader.close();
        
        //writing to a file
//        FileWriter writer = new FileWriter(outputFile);
//        writer.write("Hello IO world");
//        writer.close();
    }
}

/**
 * To check:
 * - What's the package for these classes?
 * - What classes are used to read?
 * - What classes are used to write?
 * - What data types these classes read/write?
 */
