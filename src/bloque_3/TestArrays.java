package bloque_3;

import java.util.Arrays;

/**
 * @author alonsocucei
 */
public class TestArrays {
    public static void main(String[] args) {
        int [] numbers;//declaration
        numbers = new int [5]; //instantiation
        //initialization
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        
        int [] numbers2 = {1, 2};
        
//        System.out.println(numbers.length);
//        System.out.println(numbers2.length);
        
        System.out.println(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
            numbers[i] = (int) (Math.random() * 10);
        }
        
        for (int number : numbers) {
            System.out.println(number);
        }
        
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        int [][] matrix;
        matrix = new int [4][3];
        matrix[0][0] = 1;
        matrix[2][0] = 2;
        matrix[3][1] = 5;
        matrix[0][2] = 8;
        
        int [][] matrix2 = {{1, 0, 8}, {0, 0, 0}, {2, 0, 0}, {0, 5, 0}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(matrix2));
    }
}

/**
 * To check:
 * - Array declaration, initialization, instantiation.
 * - 3 steps in one line.
 * - Multi dimensional arrays.
 * - Sort arrays.
 * - Print arrays. (exercise)
 */