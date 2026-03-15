// pseudocode 
/*
FOR i = 1 TO 10
    FOR j = 1 TO 10
        PRINT i × j
    END FOR
    PRINT new line 
END FOR
*/

// code in java

class 1to10table_with_forloop{
    public static void  main(String [] args){
        for (int i = 1; i <= 10; i++) {      // for table number
            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {  // for multiplication
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // space between tables
        }

    }
}