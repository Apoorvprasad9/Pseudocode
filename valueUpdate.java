//psedocoe
/*
Integer function(a:Integer, b:Integer,c:Integer)
         for(each c from 4 to 8)
          a=(a+1)+b
          a=(a+1)+b
          END for
          b=(5+10)+a
          a=(15+8)+a
          for(each c from 2 to 5)
          a=(10+2)&a
          b=(5+10)+a
          END for
            return a
 END FUNCTION
*/

//code in java
public class valueUpdate {
    public static int function(int a, int b, int c) {
        for (c = 4; c <= 8; c++) {
            a = (a + 1) + b;
            a = (a + 1) + b;
        }
        b = (5 + 10) + a;
        a = (15 + 8) + a;
        for (c = 2; c <= 5; c++) {
            a = (10 + 2) & a;
            b = (5 + 10) + a;
        }
        return a;
    }

    public static void main(String[] args) {
        int result = function(0, 0, 0);
        System.out.println("The final value of a is: " + result);
    }
}
