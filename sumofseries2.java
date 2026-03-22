//pseudocode
/*
Function sum(N:integer):integer
    Declare sum: integer
    set sum to 0
    for i from 1 to N do
        sum = sum + 1/i
    end for
    return sum
END FUNCTION
return sum(5)

*/
//java code
public class sumofseries2 {
    public static double sum(int N) {
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        double result = sum(5);
        System.out.println("The sum of the series 1 + 1/2 + 1/3 + 1/4 + 1/5 is: " + result);
    }
}