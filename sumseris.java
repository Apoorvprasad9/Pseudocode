//pseudocode
/*
function sum(N:integer):integer
    Declare sum: integer
    set sum to 0
    for i from 1 to N do
        sum = sum + i
    end for
    return sum
END FUNCTION
return sum(5)

*/
//java code
public class sumseris {
    public static int sum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println("The sum of the first 5 natural numbers is: " + result);
    }
}
