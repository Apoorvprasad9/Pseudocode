//pseudocode 
/*
DECLARE n:INTEGER
DECLARE sum : INTEGER 
READ n
sum :=0
FOR i := 1 TO n
sum := sum +i
END FOR 
PRINT sum 
*/

//CODE IN JAVA

import java.util.Scanner;

public class sumSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++) {
            System.out.print(i);

            if(i < n) {
                System.out.print(" + ");
            }

            sum = sum + i;
        }

        System.out.println(" = " + sum);
    }
}