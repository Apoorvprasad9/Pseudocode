//pseudocode
/*

Function reverseNumber(N:integer):integer
    Declare reversed: integer
    set reversed to 0
    while N != 0 do
        reversed = reversed * 10 + N % 10
        N = N / 10
    end while
    return reversed
END FUNCTION
return reverseNumber(12345)
*/
//java code
public class FunnreverseNumber {
    public static int reverseNumber(int N) {
        int reversed = 0;
        while (N != 0) {
            reversed = reversed * 10 + N % 10;
            N = N / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int result = reverseNumber(12345);
        System.out.println("The reverse of 12345 is: " + result);
    }
}