/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 07, 2023 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a phrase: ");
        String phrase = input.nextLine();

        System.out.println("\nEnter the word to search: ");
        String search = input.next();

        boolean contains = phrase.contains(search);

        System.out.print("\nIs there a word [" + search + "] in the phrase?: ");
        System.out.println(contains);


    }
}