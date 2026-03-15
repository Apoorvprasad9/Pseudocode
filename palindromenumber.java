//pseudocode 
/*
IMTEGER n,r,b,x
SET b=0
READ n
 WHILE n>0
      r=n mod 10
      b = b* 10+r 
      n = n/10
 END WHILE
 if(b==x) then 
 PRINT (" palindrome number")
 else
    PRINT ("not palindrome number")     
END if
*/

//code in java 

import java.util.Scanner;

public class palindromenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}