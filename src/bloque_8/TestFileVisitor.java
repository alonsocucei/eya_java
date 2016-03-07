package bloque_8;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author alonssocucei
 */
public class TestFileVisitor {

    public static void main(String[] args) {
        SimpleFileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {
            
            @Override
            public FileVisitResult preVisitDirectory(Path directory, BasicFileAttributes attributes) {
                System.out.printf("pre: %s\n", directory.getFileName());
                return FileVisitResult.CONTINUE;
            }
            
            @Override
            public FileVisitResult postVisitDirectory(Path directory, IOException ioe) {
                System.out.printf("post: %s\n", directory.getFileName());
                return FileVisitResult.CONTINUE;
            }
            
            @Override
            public FileVisitResult visitFileFailed(Path file, IOException ioe) {
                System.out.printf("failed: %s\n", file.getFileName());
                return FileVisitResult.CONTINUE;
            }
            
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
                System.out.printf("visit: %s\n", file.getFileName());
                return FileVisitResult.CONTINUE;
            }
        };
        
        try {
            Files.walkFileTree(Paths.get("C:\\users\\jjsanche\\Desktop"), visitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/**
 * To check:
 * - How would you implement a file search and stop when finding the first one that meets 
 * a criteria?
 * - What would you change to skip certain directories?
 */
