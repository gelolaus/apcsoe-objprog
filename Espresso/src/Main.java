/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 12, 2023 */

public class Main {
    public static void main(String[] args) {

        String str = "Espresso";
        String str2 = "s";
        int count = str.length();



        System.out.println("\n\nThe word is Espresso.");
        System.out.println("Substring shows characters according to the chosen Index(start) 3, Count(end) 7:\t\t" + str.substring(3,7)); // Index, Count
        System.out.println("Counts the number of characters:\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + count); // Counts number of characters
        System.out.println("Displays the index number of the letter o:\t\t\t\t\t\t\t\t\t\t\t\t" + str.indexOf("o")); // Displays index number of a (group of) character(s)
        System.out.println("Concatenates Espresso with an s:\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + str + str2); // Concatenation
        System.out.println("Capitalizes the word:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + str.toUpperCase()); // Uppercase
        System.out.println("Displays the character at index number 4:\t\t\t\t\t\t\t\t\t\t\t\t" + str.charAt(4)); // Displays character at selected index number


    }
}