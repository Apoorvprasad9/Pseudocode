//pseudocode
/*
function palindrom(N: integer ):string
   Declare r: integer
   Declare x: integer
   set r to 0
   set x to N
    while x != 0 do
         r = r * 10 + x % 10
         x = x / 10
    end while
    if r == N then
        return "palindrome"
    else
        return "not palindrome"
    end if
 */
//java code
public class funnpalindromNumber {
    public static String palindrom(int N) {
        int r = 0;
        int x = N;
        while (x != 0) {
            r = r * 10 + x % 10;
            x = x / 10;
        }
        if (r == N) {
            return "palindrome";
        } else {
            return "not palindrome";
        }
    }

    public static void main(String[] args) {
        int number = 12321; 
        String result = palindrom(number);
        System.out.println("The number " + number + " is: " + result);
    }
}
