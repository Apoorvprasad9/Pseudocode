//pseudocode
/*
INTEGER n,r,d,cut
SET cut=0
READ n,READ d
while n>0
     r=n mod 10
     n=n/10
     if r==d then
        cut=cut+1
     END if
END while
print cut

*/
//code in java
import java.util.Scanner;
public class DigitPresent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a digit to search: ");
        int digitToFind = sc.nextInt();

        int count = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit == digitToFind) {
                count++;
            }
            num = num / 10;
        }

        System.out.println("Digit " + digitToFind + " is present " + count + " times in the number.");
    }
}
