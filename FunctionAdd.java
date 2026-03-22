//pseudocode 
/*
function add(a: integer, b: integer) -> integer
    return a + b
    END FUNCTION
    return add(5, 10)
*/

//java code
public class FunctionAdd {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println("The sum of 5 and 10 is: " + result);
    }
}