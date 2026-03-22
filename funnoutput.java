//pseudocode/*
/*
intreger function (a: integer, b: integer, c: integer) -> integer
    for(each c from 3 to 5)
    a=(c+c)^b
    if((a+c)<(c+a))
        b=(a+11)+c
    else
        c=b+b
        a=3+b
        continue
    end if
    End for
    return a+b 
*/
//java code
public class funnoutput {
    public static int function(int a, int b, int c) {
        for (c = 3; c <= 5; c++) {
            a = (c + c) ^ b;
            if ((a + c) < (c + a)) {
                b = (a + 11) + c;
            } else {
                c = b + b;
                a = 3 + b;
                continue;
            }
        }
        return a + b;
    }

    public static void main(String[] args) {
        int result = function(4, 4, 7);
        System.out.println("The result of the function is: " + result);
    }
}