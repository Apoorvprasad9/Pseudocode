//pseudocode 
/*
DECLARE a : ARRAY [5] OF INTEGER
 DECLARE max : INTEGER
 SET max = a[0]
 FOR i = 0 TO 9 DO
     READ a[i]
 END FOR
 FOR i = 1 TO 9 DO
     IF a[i] < max THEN
         SET max = a[i]
     END IF
 END FOR
 PRINT max
*/
//CODE IN JAVA
import java.util.Scanner;
public class MinArray {

    public static void main(String[] args) {
        int[] a = new int[5];
        int min;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        min = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Minimum value in the array: " + min);
    }
}
