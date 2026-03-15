//pseudocode 
/*
DECLARE i : INTEGER 
DECLARE num : INTEGER 
READ num
SET i=1
WHILE i<=10
     PRINT num * i
     INCREMENT i

*/

//code in java 

public class 1to10table {

    public static void main(String [] args){
        int i = 1;

        while (i <= 10) {
            int j = 1;

            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }

            System.out.println(); 
            i++;
        }
    }
}
