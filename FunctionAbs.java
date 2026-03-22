//pseudoce
/*
function abs(a:Integer):Integer
if a < 0 then
    return a*(-1)
else
    return a
END if
END FUNCTION
return abs(-5)
*/
//java code
public class FunctionAbs {
    public static int abs(int a) {
        if (a < 0) {
            return a * (-1);
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        int result = abs(-5);
        System.out.println("The absolute value of -5 is: " + result);
    }
}
