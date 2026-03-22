//pseudocode 
/*
Function aoc(rad:real) -> real
    return 2 * 3.14 * rad
END FUNCTION
return aoc(5)

*/
//java code
public class FunctionAoc {
    public static double aoc(double rad) {
        return 2 * 3.14 * rad;
    }

    public static void main(String[] args) {
        double result = aoc(5);
        System.out.println("The area of the circle with radius 5 is: " + result);
    }
}
