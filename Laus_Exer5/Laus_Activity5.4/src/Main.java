/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 07, 2023 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input first string: ");
        String first = input.next();

        System.out.print("Input second string: ");
        String second = input.next();

        System.out.print("Input third string: ");
        String third = input.next();

        System.out.print("Input fourth string: ");
        String fourth = input.next();

        System.out.println(first.toUpperCase() + second.toUpperCase() + third.toUpperCase() + fourth.toUpperCase());

    }
}