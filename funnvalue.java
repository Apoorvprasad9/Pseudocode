//pseudocode
/*
Read n
   i=0,s=0
   function sample(int n)
      while(n>0)
            r=n%10
            p=8^i
            s=s+p*r
            i++
            n=n/10
    end while
    return s
*/
//java code
import java.util.Scanner;   
public class funnvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int result = sample(n);
        System.out.println("The result is: " + result);
    }

    public static int sample(int n) {
        int i = 0, s = 0;
        while (n > 0) {
            int r = n % 10;
            int p = (int) Math.pow(8, i);
            s += p * r;
            i++;
            n /= 10;
        }
        return s;
    }
}