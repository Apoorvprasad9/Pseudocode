//pseudocode 
/*
DECLARE X : INTEGER
DECLARE Y: INTEGER
READ X
READ Y
PRINT (X/Y)
PRINT (MOD (X,Y))  // X MOD Y

*/

//code in java 

import java.util.Scanner;

class divisionandmodulus{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int division = a / b;
        int modulus = a % b;

        System.out.println("Division = " + division);
        System.out.println("Modulus (Remainder) = " + modulus);
    }
}