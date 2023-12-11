/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 07, 2023 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = keyboardInput.next();
        System.out.println("Good day, " + firstName + "!");

        System.out.println("\nThe last four (4) characters of your name are: " + firstName.substring(2,6));

    }
}