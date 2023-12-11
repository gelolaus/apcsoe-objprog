/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 07, 2023 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
        double angleBC = Math.toDegrees(Math.asin(height / hypotenuse));
        double angleAC = Math.toDegrees(Math.asin(base / hypotenuse));
        System.out.println("The hypotenuse of the triangle is " + hypotenuse);
        System.out.println("The angle AC of the triangle is " + angleAC);
        System.out.println("The angle BC of the triangle is " + angleBC);

    }
}