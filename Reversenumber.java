//pseudocode 
/*
DECLARE n : INTEGER 
DECLARE r : INTEGER 
DECLARE b : INTEGETR 
SET b :0
READ N

WHILE n>0
    r=n MOD 10
    b=b*10+r
    n=n/10
END WHILE 
PRINT b    
*/

//CODE IN JAVA 

import java.util.Scanner;

public class Reversenumber {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse Number = " + reverse);
    }
 }
