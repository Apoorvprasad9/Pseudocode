//pseudocode
/*
read Number 
Function divisble(number)
        even counter=0,num_remainder=number;
        while(num_remaider)
            digit=num_remainder%10
        if digit !=0 and number%digit==0
            even_counter=even_counter+1
        end if
        num_remainder=num_remainder/10
        end while
        return even_counter
end function

*/
//java code
import java.util.Scanner;
public class evencounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int result = divisible(number);
        System.out.println("The count of even digits that divide the number is: " + result);
    }

    public static int divisible(int number) {
        int evenCounter = 0, numRemainder = number;
        while (numRemainder > 0) {
            int digit = numRemainder % 10;
            if (digit != 0 && number % digit == 0) {
                evenCounter++;
            }
            numRemainder /= 10;
        }
        return evenCounter;
    }
}
