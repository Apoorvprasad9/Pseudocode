//pseudocode
/*
INTEGER n,r,d
BOOLEAN found=false
READ n
READ d
while n>0
     r=n mod 10
     n=n/10
     if r==d then
        found=true
        BREAK
     END if
END while
if found=true then
    print ("digit is found")
else
    print ("digit is not found")
END if     
*/
//code in java
import java.util.Scanner;
public class digitinagivennumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a digit to search: ");
        int digitToFind = sc.nextInt();

        boolean found = false;

        while (num > 0) {
            int digit = num % 10;
            if (digit == digitToFind) {
                found = true;
                break;
            }
            num = num / 10;
        }

        if (found) {
            System.out.println("Digit is found in the number.");
        } else {
            System.out.println("Digit is not found in the number.");
        }
    }
}
