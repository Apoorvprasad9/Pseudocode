//pseudocode
/*
 DECLARE n : INTEGER
 DECLARE sum : INTEGER READ n
 FOR i:= 1 TO 10
 sum :=sum +i*i 
 END FOR 
 PRINT sum
*/

//CODE KN JAVA 

import java.util.Scanner;

public class sumSeries2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square);

            if (i < n) {
                System.out.print(" + ");
            }

            sum = sum + square;
        }

        System.out.println(" = " + sum);
    }
}
