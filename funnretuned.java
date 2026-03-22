//pseudocode/*
/*
integer computevalue(integer a,integer b)
         integer result =1
         while(B>0)
            if(b%2==1)
               result=result*a
               a=a*a
               b=b/2
            End while
         return result
End function
*/
//java code
import java.util.Scanner;
public class funnretuned {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int result = computeValue(a, b);
        System.out.println("The result is: " + result);
    }

    public static int computeValue(int a, int b) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result *= a;
            }
            a *= a;
            b /= 2;
        }
        return result;
    }
}
