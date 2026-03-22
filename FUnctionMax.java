//pseudocode
/*
Function max(a: integer, b: integer) -> integer
Declare c: integer
    if a > b then
        c := a
    else
       c := b
    end if
    return c
    END FUNCTION
return max(5, 10)
*/
//java code
public class FUnctionMax {
    public static int max(int a, int b) {
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        return c;
    }

    public static void main(String[] args) {
        int result = max(5, 10);
        System.out.println("The maximum of 5 and 10 is: " + result);
    }
}