//Pseudocode 
/*
DECLARE length : REAL
DECLARE breadth : REAL
DECLARE area : REAL 
DECLARE = peri
READ length 
READ breadth
area :=length*breadth
peri := 2*(length +breadth)
PRINT area
PRINT Peri
*/

// java code 

import java.util.Scanner;

public class FindArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Area of Rectangle = " + area);
    }
}