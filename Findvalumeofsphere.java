// pseudocode 
/*
DECLARE R : REAL
CONSTANT PI: 3.14
DECLARE volume : REAL
volume :=4/3*R*R*R
PRINT volume 
*/

//code in java

import java.util.Scanner;

public class Findvalumeofsphere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of sphere: ");
        double r = sc.nextDouble();

        double volume = (4.0/3) * Math.PI * r * r * r;

        System.out.println("Volume of Sphere = " + volume);
    }
}