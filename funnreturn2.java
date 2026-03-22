//pseudocode
/*
Integer funn(Integer a,Integer b,Integer c)
            if((c^b+a)<(a&c))
            b=a^b
            c=(a+3)+c
            end if
            if((3^b)+(c^c)>(11&c))
              b=(c+12)^a
            end if
 return a+b+c

*/
//java code
import java.util.Scanner;
public class funnreturn2 {
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
        if ((c ^ b + a) < (a & c)) {
            b = a ^ b;
            c = (a + 3) + c;
        }
        if ((3 ^ b) + (c ^ c) > (11 & c)) {
            b = (c + 12) ^ a;
        }
        return a + b + c;
    }
}
