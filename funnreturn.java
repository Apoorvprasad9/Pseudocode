//pseudocode
/*
Integer funn(Integer a,Integer b,Integer c)
            if((a^8)<8)
               c=a+c
               c=a+c
            end if
return a+b+c 
*/
//java code
import java.util.Scanner;
public class funnreturn {
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
         if ((a ^ 8) < 8) {
               c = a + c;
               c = a + c;
         }
         return a + b + c;
      }
   }