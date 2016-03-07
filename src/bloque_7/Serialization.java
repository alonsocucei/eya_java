package bloque_7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @author alonsocucei
 */
public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String sourceFile = System.getProperty("user.home") + "\\Desktop\\serialization file.txt";
        MyDate birthDay = new MyDate();
        birthDay.year = 1984;
        birthDay.month = 3;
        birthDay.day = 21;
        
//        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(sourceFile));
//        writer.writeObject(birthDay);
//        writer.close();
        
        ObjectInputStream reader = new ObjectInputStream(new FileInputStream(sourceFile));
        MyDate serializedDate = (MyDate) reader.readObject();
        System.out.println("year: " + serializedDate.year);
        System.out.println("month: " + serializedDate.month);
        System.out.println("day: " + serializedDate.day);
        reader.close();
    }
}

class MyDate implements Serializable {
    int year;
    int month;
    int day;
}

/**
 * To check:
 * - What's serialization?
 * - Why is used?
 * - What classes are used to serialize an object?
 * - How an object is serialized? (exercise)
 */