//pseudocode
/*
Integer funn(Integer a,Integer b,Integer c)
       b=(a^11)&b
       for(each c from 3 to 6)
               b=3+c
               if((1<b) || (a&c) <(c-a))
                    a(c+2)+c
                     b=c+c
                     jump out of the loop
                end if
         end for
return a+b
End function
*/
//java code
import java.util.Scanner;
public class funnoutput4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        int result = funn(a, b, c);
        System.out.println("The result is: " + result);
    }

    public static int funn(int a, int b, int c) {
        b = (a ^ 11) & b;
        for (c = 3; c <= 6; c++) {
            b = 3 + c;
            if ((1 < b) || (a & c) < (c - a)) {
                a = (c + 2) + c;
                b = c + c;
                break; // jump out of the loop
            }
        }
        return a + b;
    }
}