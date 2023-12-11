/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 07, 2023 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = keyboardInput.next();

        System.out.println("Enter your middle name:");
        String middleName = keyboardInput.next();

        System.out.println("Enter your last name:");
        String lastName = keyboardInput.next();

        System.out.println("Good day, " + firstName + " " + middleName + " " + lastName + "!");

        System.out.println("Your name initials are as follow: " + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0));

    }
}