package bloque_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * - Files class is a static class which work is to operate on files using Path objects.
 * - Operations include: create, delete, move, check for existence.
 */
public class TestFiles {
    public static void main(String[] args) throws IOException {
        //Creating and deleting a file
        Path path1 = Paths.get("tempFile.txt");
        System.out.printf("file: %s exists: %b\n", path1, Files.exists(path1));
        Files.createFile(path1);
        System.out.printf("file: %s exists: %b\n", path1, Files.exists(path1));
        Files.delete(path1);
        System.out.printf("file: %s exists: %b\n", path1, Files.exists(path1));
        
        //Creating and deleting a directory
        Path path2 = Paths.get("tempDirectory");
        System.out.printf("file: %s exists: %b\n", path2, Files.exists(path2));
        Files.createDirectory(path2);
        System.out.printf("file: %s exists: %b\n", path2, Files.exists(path2));
        Files.delete(path2);
        System.out.printf("file: %s exists: %b\n", path2, Files.exists(path2));
        
        //Creating a directory tree
        Path path3 = Paths.get("dir1/dir2/dir3");
        System.out.printf("file: %s exists: %b\n", path3, Files.exists(path3));
        Files.createDirectories(path3);
        System.out.printf("file: %s exists: %b\n", path3, Files.exists(path3));
        Files.delete(path3);
        System.out.printf("file: %s exists: %b\n", path3, Files.exists(path3));
    }
}

/**
 * To check:
 * - What directories will be deleted using Files.delete(path3)?
 * - What's the difference between delete() and deleteIfExists() methods?
 * - What does the notExists() method returns?
 * - What happens when trying to delete a non empty directory?
 * - What happens when trying to create a directory/file already exists?
 */