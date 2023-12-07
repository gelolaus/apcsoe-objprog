/* Created by:
 * Angelo John Benedict Laus - CPE231
 * December 12, 2023 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date today = new Date();
        SimpleDateFormat sdf1, sdf2;
        sdf1 = new SimpleDateFormat("MM/dd/yy"); sdf2 = new SimpleDateFormat("MMMM dd, yyyy");

        System.out.println("\n\nSimple Date Format");
        System.out.println("Day, Date, and Time Today:\t\t" + today.toString()); // Shows the full date without any formatting
        System.out.println("MM/DD/yy Format:\t\t\t\t" + sdf1.format(today)); // Shows the month, date, and year with the format MM/DD/yy
        System.out.println("MMMM dd, yyyy Format:\t\t\t" + sdf2.format(today)); // Shows the month, date, and year with the format MMM dd, yyyy


    }
}