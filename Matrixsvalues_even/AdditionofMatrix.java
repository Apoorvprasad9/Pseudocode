//pseudocode 
/*
DECLARE X:ARRAY [3][3] OF INTEGER
DECLARE Y:ARRAY [3][3] OF INTEGER
DECLARE Z:ARRAY [3][3] OF INTEGER
FOR i = 0 TO 2 DO
    FOR j = 0 TO 2 DO
        READ X[i][j]
        READ Y[i][j]
    END FOR
END FOR
FOR i = 0 TO 2 DO
    FOR j = 0 TO 2 DO
        Z[i][j] = X[i][j] + Y[i][j]
    END FOR
END FOR
FOR i = 0 TO 2 DO
    FOR j = 0 TO 2 DO
        PRINT Z[i][j]
    END FOR
END FOR
*/
import java.util.Scanner;
public class AdditionofMatrix {
    
    public static void main(String[] args) {
        int[][] X = new int[3][3];
        int[][] Y = new int[3][3];
        int[][] Z = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for the first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                X[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values for the second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Y[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Z[i][j] = X[i][j] + Y[i][j];
            }
        }

        System.out.println("Result of addition of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Z[i][j] + " ");
            }
            System.out.println();
        }
    }
}
