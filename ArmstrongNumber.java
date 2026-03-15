//pseudocode 
/*
INTEGER n,r,b,x
SET n=0
READ n, SETx=n
while (n>0)
  r= n mod 10 
  b= b+r*r*r
  n=n/10
  END WHILE 
  if (b==x) then 
     print ("Armstrong")
  else
    print("NOt armstrong")
  END if  

*/
//code in java

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}