/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 07, 2023 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the rectangle: ");
        double height = input.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        double area = height * width;
        System.out.println("The area of the rectangle is " + area);
    }
}