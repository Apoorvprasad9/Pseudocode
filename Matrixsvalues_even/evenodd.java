//pseudocode 
/*
DECLARE X : ARRAY [3][3] OF INTEGER
DECLARE even : INTEGER
DECLARE odd : INTEGER
SET even = 0
SET odd = 0
FOR i = 0 TO 2 DO
    FOR j = 0 TO 2 DO
        READ X[i][j]
    END FOR
END FOR
FOR i = 0 TO 2 DO
    FOR j = 0 TO 2 DO
        IF X[i][j] MOD 2 = 0 THEN
            even = even + 1
        ELSE
            odd = odd + 1
        END IF
    END FOR
END FOR
PRINT EVEN
PRINT ODD
*/
import java.util.Scanner;
public class evenodd {
    
    public static void main(String[] args) {
        int[][] X = new int[3][3];
        int even = 0;
        int odd = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 integers for the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                X[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (X[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}
