//pseudocode
/*
DECLARE a : ARRAY [5] OF REAL
DECLARE sum : REAL
SET sum = 0
FOR i = 0 TO 4 DO
    READ a[i]
END FOR
for i = 0 
    sum = sum + a[i]
END FOR
PRINT sum

*/
//code in java
public class sumofArray {

    public static void main(String[] args) {
        double[] a = new double[5];
        double sum = 0;

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter 5 real numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }

        System.out.println("Sum of the array: " + sum);
    }
}