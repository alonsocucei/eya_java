package bloque_8;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author alonsocucei 
 */
public class TestDirectoryStream {
    public static void main(String[] args) {
        Path root = Paths.get("C:\\");
        
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(root);){
            for (Path path: stream) {
                System.out.println(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //filtering
        System.out.println("Filtering:");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(root, "*.sys");){
            for (Path path: stream) {
                System.out.println(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * To check:
 * - What happens if path is an existing/not existing file?
 */