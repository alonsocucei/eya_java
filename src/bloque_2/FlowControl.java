package bloque_2;

/**
 * @author alonsocucei
 */
public class FlowControl {
    public static void main(String[] args) {
        boolean condition = Math.random() > 0.3;
        
        if (condition)
            System.out.println("if without braces");
            System.out.println("always executes");
        
        if (condition) {
            System.out.println("if with braces");
            System.out.println("executes just if condition is true");
        }
        
        int month = (int) (Math.random() * 12) + 1;
        int year = (int) (Math.random() * 2100);
        System.out.println("Month is: " + month);
        System.out.println("Year is: " + year);
        
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else {
            if (year % 4 == 0) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
        }
        
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("Not a valid month");
        }
        
        int step = 0;
        
        switch(step) {
            default:
                System.out.println("review - start process");
            case 1:
                System.out.println("step 1");
            case 2:
                System.out.println("step 2");
            case 3:
                System.out.println("step 3");
            case 4:
                System.out.println("step 4");
            case 5:
                System.out.println("step 5");
            case 6:
                System.out.println("step 6");
        }
    }
}

/**
 * To check:
 * - if, if-else, if-else_if and if-else_if-else statements.
 * - what expressions are valid for if-else_if-else statements?
 * - switch statement.
 * - what data types are valid when using a switch?
 * - Does default must be always at end?
 */