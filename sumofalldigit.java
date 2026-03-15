//pseudocode 
/*
INTEGER n,r,sum
SET sum =0
READ n
    while n>0
        r=n mod 10
        n=n/10
        sum=sum +r 
    END while 
    print sum 
*/
//code in java

import java.util.Scanner;

public class sumofalldigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}