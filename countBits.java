//pseudocode
/*
Integer countBits(integer n)
     integer count=0
     while(n>0)
        count=count+(n%2)
        n=n/2
     end while
     return count
End function
*/
//java code
import java.util.Scanner;
public class countBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int result = countBits(n);
        System.out.println("The count of bits in the binary representation of the number is: " + result);
    }

    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n % 2;
            n /= 2;
        }
        return count;
    }
}