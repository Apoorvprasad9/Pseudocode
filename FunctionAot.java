//pseudocode 
/*
Function aot(base:real, height:real) -> real
    return 0.5 * base * height
END FUNCTION
return aot(5, 10)
*/
//java code
public class FunctionAot {
    public static double aot(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double result = aot(5, 10);
        System.out.println("The area of the triangle with base 5 and height 10 is: " + result);
    }
}
