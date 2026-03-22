//pseudocode
/*
function factorial(N: integer) -> integer
    Declare fac: integer
    set fac to 1
    for i from 1 to N do
        fac = fac * i
    end for
    return fac
END FUNCTION
return factorial(5)

*/
//java code
public class FunctionFactorial {
    public static int factorial(int N) {
        int fac = 1;
        for (int i = 1; i <= N; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("The factorial of 5 is: " + result);
    }
}